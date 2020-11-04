package com.jengland.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jengland.lookify.models.Rating;
import com.jengland.lookify.models.Song;
import com.jengland.lookify.repositories.RatingRepo;
import com.jengland.lookify.repositories.SongRepository;

@Service
public class SongService {
	
	private final SongRepository songRepo;
	private final RatingRepo ratingRepo;
	
	public SongService(SongRepository songRepo, RatingRepo ratingRepo) {
		this.songRepo = songRepo;
		this.ratingRepo = ratingRepo;
	}
	
	public List<Song> allSongs() {
		return songRepo.findAll();
	}

	public Song addSong(Song song) {
		return songRepo.save(song);
	}
	
	public Song findSong(Long id) {
		Optional<Song> song = songRepo.findById(id);
		if (song.isPresent()) {
			return song.get();
		} else {
			return null;
		}
	}
	
	public Rating create(Rating newRating) {
		List<Rating> matchingRatings = ratingRepo.matchingRatings(
				newRating.getUser().getId(), 
				newRating.getSong().getId());
		if(matchingRatings.size() > 0) {
			return null;
		}
		newRating.setId(null);
		return ratingRepo.save(newRating);
	}
	
	public List<Song> search(String search) {
		List<Song> songs = songRepo.findByArtistContaining(search);
		return songs;
	}
//	
//	public List<Song> topTen() {
//		return songRepo.findTop10ByOrderByRatingDesc();
//	}
	
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
}

package com.jengland.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jengland.lookify.models.Song;
import com.jengland.lookify.repositories.SongRepository;

@Service
public class SongService {
	
	private final SongRepository songRepo;
	
	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;
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
	
	public List<Song> search(String search) {
		List<Song> songs = songRepo.findByArtistContaining(search);
		return songs;
	}
	
	public List<Song> topTen() {
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
}

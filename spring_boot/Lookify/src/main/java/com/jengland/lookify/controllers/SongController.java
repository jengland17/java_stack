package com.jengland.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jengland.lookify.models.Song;
import com.jengland.lookify.services.SongService;

@Controller
public class SongController {
	
	private final SongService songService;
	
	public SongController(SongService songService) {
		this.songService = songService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp"; 
	}
	
	@GetMapping("/dashboard")
	public String dashboard(@RequestParam(value="search", required=false) String search, Model model) {
		System.out.println(search);
		if (search == null ) {
			model.addAttribute("songs", songService.allSongs());
		} else {
			model.addAttribute("songs", songService.search(search));
		}
		return "dashboard.jsp";
	}

	@GetMapping("/songs/new")
	public String addNew(@ModelAttribute("newSong") Song newSong, Model model) {
		return "new.jsp";
	}
	
	@GetMapping("/songs/{id}")
	public String oneSong(@PathVariable("id") Long id, Model model) {
		Song song = songService.findSong(id);
		model.addAttribute("song", song);
		return "show.jsp";
	}
	
	@PostMapping("/songs/new")
	public String newSong(@Valid @ModelAttribute("newSong") Song newSong, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			songService.addSong(newSong);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/search/topten")
	public String top(Model model) {
		List<Song> songs = songService.topTen();
		model.addAttribute("songs", songs);
		return "top.jsp";
	}
	 
	@GetMapping("/delete/{id}")
	public String remove(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	
	
	
}

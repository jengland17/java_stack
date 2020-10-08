package com.jengland.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jengland.books.models.Book;
import com.jengland.books.services.BookService;

@Controller
public class BookController {
	
	private final BookService bookService;
	
	public BookController (BookService bookService) {
		this.bookService = bookService;
	}

	
	@RequestMapping("/books") 
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/show/{id}")
	public String showBook(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	@RequestMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "edit.jsp";
	}
	
	@PostMapping("/books/{id}/edit")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			bookService.updateBook(book);
			return "redirect:/books";
		}
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
	
}

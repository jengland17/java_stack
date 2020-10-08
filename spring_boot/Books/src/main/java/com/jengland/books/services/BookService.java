package com.jengland.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jengland.books.models.Book;
import com.jengland.books.repositories.BookRepository;

@Service
public class BookService {
	
	private final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
	public Book createBook(Book b) {
		return bookRepo.save(b);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	} 
	
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	
    public Book updateBook(Long id, String title, String description, String language, Integer pages) {
    	Optional <Book> update = bookRepo.findById(id);
    	if(update != null && update.isPresent()) {
    		update.get().setTitle(title);
    		update.get().setDescription(description);
    		update.get().setNumberOfPages(pages);
    		bookRepo.save(update.get());
    		return update.get();
    	}
    	return null;        
    } 
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
}

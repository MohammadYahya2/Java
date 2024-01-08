package com.javaspring.booksapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javaspring.booksapi.models.Book;
import com.javaspring.booksapi.repositories.BookRepository;


@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	//returns all the books
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	
	//creates a book
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}
		else {
			return null;
		}
	}
	
	//updates a book
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Book updateBook = findBook(id);
		updateBook.setTitle(title);
		updateBook.setDescription(desc);
		updateBook.setLanguage(lang);
		updateBook.setNumberOfPages(numOfPages);
		return bookRepository.save(updateBook);
	}
	
	//delete a book
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}


package com.example.loginregistration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginregistration.model.Book;
import com.example.loginregistration.model.User;
import com.example.loginregistration.repositories.BookRepositories;
@Service
public class BookServices {
	@Autowired
	BookRepositories bookRepositories;
	
	public List<Book> allBooks(){
		return bookRepositories.findAll();
	}
	
	public Book createBooks(Book book, User user) {
		book.setUser(user);
		return bookRepositories.save(book);
	}
	
	public Book findBooks(Long id) {
        Optional<Book> optionalBook= bookRepositories.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public void deleteBook(Long id) {
		bookRepositories.deleteById(id);
	}
	 public Book updateBook(Book book) {
	        return  bookRepositories.save(book);
	      }
	 
	 
	 
//	 public void editlogin(Long id,	Book book) {
//		 if(id.equals(id)) {
//			 bookRepositories.save(book);
//		 }else {
//			 System.out.println("nothing");
//		 }
//	 }
	
}

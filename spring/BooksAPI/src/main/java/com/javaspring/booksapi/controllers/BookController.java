package com.javaspring.booksapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javaspring.booksapi.models.Book;
import com.javaspring.booksapi.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/book/{id}")
	public String index(@PathVariable("id") long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "index.jsp";
	}
	
	public void printall() {
	
	}
}

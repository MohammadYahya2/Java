package com.javaspring.booksapi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaspring.booksapi.models.Book;
import com.javaspring.booksapi.services.BookService;

@Controller
public class BookController {
    private final BookService bookService;
    
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
}

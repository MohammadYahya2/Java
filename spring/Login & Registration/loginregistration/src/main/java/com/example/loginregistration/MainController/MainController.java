package com.example.loginregistration.MainController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.loginregistration.model.Book;
import com.example.loginregistration.model.LoginUser;
import com.example.loginregistration.model.User;
import com.example.loginregistration.services.BookServices;
import com.example.loginregistration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("newUser", new User());
		model.addAttribute("user", new LoginUser());
		return "index.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		userService.register(newUser, result);
		if (result.hasErrors()) {

			model.addAttribute("user", new LoginUser());
			return "index.jsp";
		} else {
			session.setAttribute("loginId", newUser.getId());

			return "redirect:/home";
		}

	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("user") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		User user = userService.login(newLogin, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());

			return "index.jsp";
		} else {
			session.setAttribute("loginId", user.getId());

			return "redirect:/home";
		}

	}

	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
		Long id = (Long) session.getAttribute("loginId");
		User user = userService.find_User(id);
		model.addAttribute("userName", user.getUserName());
		List<Book> books = bookServices.allBooks();
		model.addAttribute("books", books);

		return "home.jsp";
	}

	@GetMapping("/logout")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	private final BookServices bookServices;

	public MainController(BookServices bookServices) {
		this.bookServices = bookServices;
	}

	@GetMapping("/books/new")
	public String newBookForm(@ModelAttribute("newBook") Book book, Model model, HttpSession session) {
		model.addAttribute("books", bookServices.allBooks());
		return "book.jsp";
	}

	@PostMapping("/books/new")
	public String newBook(@Valid @ModelAttribute("newBook") Book book, BindingResult result, Model model,
			HttpSession session) {
		Long loginId = (Long)session.getAttribute("loginId");
		User user = userService.find_User(loginId);
		if (result.hasErrors()) {
			model.addAttribute("newBook", new Book());
			return "book.jsp";
		}
	    book.setUser(user);
		bookServices.createBooks(book, user );
		return "redirect:/home";
	}
	@GetMapping("/show/{id}")
	public String showbook(@PathVariable("id") Long id, Model model) {
		Book book=bookServices.findBooks(id);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	@DeleteMapping("/books/{id}")
	public String destroy(@PathVariable("id") Long id) {
		bookServices.deleteBook(id);
		return "redirect:/home";
	}
	@RequestMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookServices.findBooks(id);
		model.addAttribute("book", book);
		return "edit.jsp";
	}

	@PutMapping("/books/{id}/edit")
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("book", book);
			return "edit.jsp";
		} else {
			bookServices.updateBook(book);
			return "redirect:/home";
		}
	}

}
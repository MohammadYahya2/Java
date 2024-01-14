package com.example.loginregistration.MainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.loginregistration.model.LoginUser;
import com.example.loginregistration.model.User;
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
//		model.addAttribute("email", user.getEmail());
		model.addAttribute("userName", user.getUserName());
	
		return "home.jsp";
	}

	@GetMapping("/logout")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
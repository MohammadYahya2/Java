package com.example.BurgerTracker.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BurgerTracker.models.Burger;
import com.example.BurgerTracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	private final BurgerService burgerService;

	public BurgerController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}

	@RequestMapping("/")
	public String index(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurger();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	@PostMapping("/burger")
	public String createburger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurger();
			model.addAttribute("burgers", burgers);
			return "index.jsp";
		} else {
			burgerService.createBurger(burger);
			return "redirect:/";
		}
	}

	@RequestMapping("/burger/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Burger burger = burgerService.findBurger(id);
		model.addAttribute("burger", burger);

		return "edit.jsp";
	}

	@PutMapping("/burger/{id}")
	public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "edit.jsp";
		} else {
			burgerService.updateBurger(burger);
			return "redirect:/";
		}
	}
}

package com.example.savetravels.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.savetravels.model.savetravelsmodel;
import com.example.savetravels.services.SaveTravelsServices;

import jakarta.validation.Valid;

@Controller
public class MainController {
	private final SaveTravelsServices saveTravelsServices;

	public MainController(SaveTravelsServices saveTravelsServices) {
		this.saveTravelsServices = saveTravelsServices;
	}

	@RequestMapping("/expenses")
	public String index(@ModelAttribute("savetravels") savetravelsmodel savetravels, Model model) {
		List<savetravelsmodel> travels = saveTravelsServices.allSaveTravels();
		model.addAttribute("travels", travels);
		return "index.jsp";
	}

	@PostMapping("/expenses")
	public String createSaveTravels(@Valid @ModelAttribute("savetravels") savetravelsmodel savetravels,
			BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			saveTravelsServices.createSaveTravels(savetravels);
			return "redirect:/expenses";
		}
	}

	@RequestMapping("/expenses/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		savetravelsmodel savetravels = saveTravelsServices.findSaveTravels(id);
		model.addAttribute("savetravels", savetravels);
		return "edit.jsp";
	}

	@PutMapping("/expenses/{id}")
	public String update(@Valid @ModelAttribute("travels") savetravelsmodel savetravels, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("savetravels", savetravels);
			return "edit.jsp";
		} else {
			saveTravelsServices.updateSaveTravels(savetravels);
			return "redirect:/expenses";
		}
	}

	@GetMapping("/expenses/{id}/show")
	public String show(@PathVariable("id") Long id, Model model) {
		savetravelsmodel savetravels = saveTravelsServices.findSaveTravels(id);
		model.addAttribute("savetravels", savetravels);

		return "show.jsp";
	}

	@DeleteMapping("/expenses/{id}/delete")
	public String destroy(@PathVariable("id") Long id) {
		saveTravelsServices.deletesavetravel(id);
		return "redirect:/expenses";
	}

}

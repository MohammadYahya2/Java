package com.example.dojo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojo.models.Dojo;
import com.example.dojo.services.DojoService;

import jakarta.validation.Valid;


@Controller
public class DojoControllers {
	private final DojoService dojoService;
	
	public DojoControllers(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
	    	 model.addAttribute("dojo", dojo);
	    	 return "newdojo.jsp";
	     } else {
	    	 dojoService.createDojo(dojo);
		     return "redirect:/dojos/new";
	     } 
	}
	
}

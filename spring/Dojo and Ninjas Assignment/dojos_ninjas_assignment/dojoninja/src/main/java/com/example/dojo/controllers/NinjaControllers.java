package com.example.dojo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojo.models.Dojo;
import com.example.dojo.models.Ninja;
import com.example.dojo.services.DojoService;
import com.example.dojo.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaControllers {
	private final NinjaService ninjaService;
	
	@Autowired
	DojoService dojoService;
	
	public NinjaControllers(NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}
	
	@GetMapping("/ninjas/new")
	public String newDojo(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "newuser.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String newDojo(@Valid @ModelAttribute("newNinja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", ninja);
	    	 return "newuser.jsp";
	     } else {
	    	 ninjaService.createNinja(ninja);
		     return "redirect:/ninjas/new";
	     } 
	}
	
	@GetMapping("dojos/{id}")
	public String showDojo(@ModelAttribute("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
			model.addAttribute("dojo", dojo);
	    	 return "index.jsp";
	}


}

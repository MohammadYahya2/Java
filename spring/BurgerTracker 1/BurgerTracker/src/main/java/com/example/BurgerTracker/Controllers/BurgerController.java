package com.example.BurgerTracker.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.BurgerTracker.models.Burger;
import com.example.BurgerTracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	private final BurgerService burgerService;
    public BurgerController(BurgerService burgerService){
        this.burgerService = burgerService;
    }
//    @RequestMapping("/")
//	public List<Burger> index1(){
//		return burgerService.allBurger();
//	}
    @RequestMapping("/")
    public String index(@ModelAttribute("burger") Burger burger,Model model ) {
    	List<Burger> burgers=burgerService.allBurger();
    	model.addAttribute("burgers",burgers);
		return "index.jsp";
    	
    }
    @PostMapping("/burger")
    public String createburger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
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
    
    @PostMapping("/burger/{id}")
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burger", burger);
            return "edit.jsp";
        } else {
            burger.setId(id);  
            burgerService.updateBurger(burger);
            return "redirect:/";
        }
    }

    
    
}

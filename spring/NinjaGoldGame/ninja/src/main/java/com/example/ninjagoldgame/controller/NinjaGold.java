package com.example.ninjagoldgame.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGold {

	@GetMapping("/")
	public String index(Model model, HttpServletRequest request) {
		Integer golds = (Integer) request.getSession().getAttribute("golds");
		String logs = (String) request.getSession().getAttribute("logs");

		if (golds == null) {
			golds = 0;
		}
        model.addAttribute("golds", golds);

		if (logs == null) {
	        model.addAttribute("logs", "");
		} else {
	        model.addAttribute("logs", logs);
		}
		return "index.jsp";
	}

	@PostMapping("/golds")
	public String findGold(@RequestParam(name = "place") String place, HttpServletRequest request) {

		Integer golds = (Integer) request.getSession().getAttribute("golds");
		String logs = (String) request.getSession().getAttribute("logs");
		if (golds == null) {
			golds = 0;
		}
		if (logs == null) {
			logs = "";
		}
		 LocalDateTime myDateObj = LocalDateTime.now();  
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");  
		    String formattedDate = myDateObj.format(myFormatObj);  
		if (place.equals("farm")) {
			logs = logs + "You enered a farm and earned\n"+golds+" [ "+formattedDate+" ] ";
			request.getSession().setAttribute("golds", golds + getRandomNumber(10, 20));
			request.getSession().setAttribute("logs", logs);


		} else if (place.equals("cave")) {
			logs = logs + "You enered a cave and earned\n"+golds+" [ "+formattedDate+" ] ";
			request.getSession().setAttribute("golds", golds + getRandomNumber(5, 10));
			request.getSession().setAttribute("logs", logs);

		} else if (place.equals("house")) {
			logs = logs + "You enered a house and earned\n"+golds+" [ "+formattedDate+" ] ";
			request.getSession().setAttribute("golds", golds + getRandomNumber(2, 5));
			request.getSession().setAttribute("logs", logs);

		} else if (place.equals("quest")) {
			logs = logs + "You enered a quest and earned\n"+golds+" [ "+formattedDate+" ] ";
			request.getSession().setAttribute("golds", golds + getRandomNumber(-50, 50));
			request.getSession().setAttribute("logs", logs);

		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "invalid place");
		}
		return "index.jsp";
	}

	public static int getRandomNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}
	@GetMapping("/reset")
	public String resetSession(HttpServletRequest request) {
	    // Invalidating the current session
	    request.getSession().invalidate();

	    // Creating a new session
	    HttpSession newSession = request.getSession(true);

	    // Resetting attributes as needed
	    newSession.setAttribute("golds", 0);
	    newSession.setAttribute("logs", "");

	    return "redirect:/"; // Redirect to the homepage or desired page after resetting the session
	}
	
	
}

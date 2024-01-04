package com.example.omikuji.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class OmikujiController {

	public static void main(String[] args) {
		
		
		SpringApplication.run(OmikujiController.class, args);
	}

	@RequestMapping("/")
	public String index() {
		
		return "Omikuji.jsp";
	}
	@PostMapping("/show")
	public String posst(
	    @RequestParam(value="quantity") Integer number,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="living") String living,
	    @RequestParam(value="Message") String Message,
		HttpSession session){
			
		session.setAttribute("number",number );
		session.setAttribute("city",city );
		session.setAttribute("hobby",hobby );
		session.setAttribute("living",living );
		session.setAttribute("Message",Message );
		
	    return "redirect:/show";
	}

//	@RequestMapping(value="/show", method=RequestMethod.GET)
//	public String index1(Model model) {
//		
//		
//		return "show.jsp";
//	}
	@GetMapping("/show")
	public String show(Model model ,HttpSession session) {


		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("hobby",session.getAttribute("hobby"));
		model.addAttribute("living", session.getAttribute("living"));
		model.addAttribute("Message",session.getAttribute("Message"));
		
		
		
		return "show.jsp";
	}


}

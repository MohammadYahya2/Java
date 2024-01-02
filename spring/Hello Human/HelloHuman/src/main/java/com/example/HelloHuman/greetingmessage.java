package com.example.HelloHuman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingmessage {
	@GetMapping("/")
	public String index(@RequestParam(value="q") String addname) {
		if (addname != null && addname.length() > 0)

		     return "Hello " + addname;
		else {
	return "Hello Human";
		}
   
    }
	
	
}

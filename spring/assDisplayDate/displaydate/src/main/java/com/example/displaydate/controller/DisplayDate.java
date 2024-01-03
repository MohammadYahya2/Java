package com.example.displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DisplayDate {
@RequestMapping("/")
	public String home() {
		return "home.jsp";
	
	}
@RequestMapping("/date")
	public String date() {
	return "date.jsp";

}
@RequestMapping("/time")
	public String time() {
		return "time.jsp";

	}
}

package com.assignment.Daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/Daikichi")
	public String index() {
        return "Welcome!";
}
	@RequestMapping(value = "/Daikichi/today", method = RequestMethod.GET)
	public String today() {
        return "Today you will find luck in all your endeavors!";
}
	@RequestMapping(value = "/Daikichi/tomorrow", method = RequestMethod.GET)
	public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
}
}

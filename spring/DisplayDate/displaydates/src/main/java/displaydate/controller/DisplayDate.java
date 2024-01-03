package displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DisplayDate {
	@RequestMapping("/")
	public String home() {
	    return "Home.jsp";
	}

}

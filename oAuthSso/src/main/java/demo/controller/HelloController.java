package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String root() {
		return "home";
	}

	@RequestMapping("/greeting")
	public String greeting() {
		return "hello";
	}

}

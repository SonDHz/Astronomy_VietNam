package com.astronomy.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller(value = "HomeControllerOfWeb")
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "web/index";
	}

	@RequestMapping(value = "login")
	public String login(@RequestParam(required = false) String message, final Model model) {
		if (message != null && !message.isEmpty()) {
			if (message.equals("logout")) {
				model.addAttribute("message", "Logout!");
			}
			if (message.equals("error")) {
				model.addAttribute("message", "Login Failed!");
			}
		}
		return "login";
	}

	@RequestMapping(value = "user/shoppingTools")
	public String shopping() {
		return "web/shopping_tools";
	}
}

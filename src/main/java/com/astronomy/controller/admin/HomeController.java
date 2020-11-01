package com.astronomy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "HomeControllerOfAdmin")
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "admin/index";
	}
}

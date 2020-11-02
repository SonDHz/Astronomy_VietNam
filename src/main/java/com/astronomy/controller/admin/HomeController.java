package com.astronomy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "HomeControllerOfAdmin")
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "admin/dashboard";
	}
	
	@RequestMapping("/account")
	public String Account() {
		return "admin/account_manager";
	}
	
	@RequestMapping("/manufacturer")
	public String Manufacturer() {
		return "admin/manufacturer_manager";
	}
}

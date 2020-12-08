package com.astronomy.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.IProductService;

@Controller(value = "HomeControllerOfAdmin")
@RequestMapping(value = "/admin")
public class HomeController {
	@Autowired
	IProductService product;
	
	@RequestMapping("dashboard")
	public String index(Model model, @RequestParam(value = "number", required = false) Long number) {
		model.addAttribute("product", product.count());
		return "admin/dashboard";
	}
}
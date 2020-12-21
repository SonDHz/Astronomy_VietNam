package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.IPostService;
import com.astronomy.Service.IProductService;
import com.astronomy.entity.PostEntity;

@Controller(value = "HomeControllerOfAdmin")
@RequestMapping(value = "/admin")
public class HomeController {
	@Autowired
	IProductService product;
	
	@Autowired
	private IPostService service;
	
	@RequestMapping("dashboard")
	public String index(Model model, @RequestParam(value = "number", required = false) Long number) {
		model.addAttribute("product", product.count());
		List<PostEntity> list = service.getAllIdDescLimit();
		model.addAttribute("entity", list);
		return "admin/dashboard";
	}
	
	@RequestMapping("Edit")
	public String e() {
		return "admin/Post_Edit";
	}
	
}
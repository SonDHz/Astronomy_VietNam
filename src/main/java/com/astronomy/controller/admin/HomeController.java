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

import com.astronomy.Service.IOrderService;
import com.astronomy.Service.IPostService;
import com.astronomy.Service.IProductService;
import com.astronomy.Service.IUserService;


@Controller(value = "HomeControllerOfAdmin")
@RequestMapping(value = "/admin")
public class HomeController {
	@Autowired
	IProductService product;
	
	@Autowired

	private IPostService service;

	IOrderService order;
	
	@Autowired
	IUserService user;
	
	@Autowired
	IPostService post;

	
	@RequestMapping("dashboard")
	public String index(Model model, @RequestParam(value = "number", required = false) Long number) {
		model.addAttribute("product", product.count());
		model.addAttribute("order", order.countOrder());
		model.addAttribute("accout", user.countUser());
		model.addAttribute("post", post.countPost());
		return "admin/dashboard";
	}
	

	@RequestMapping("Edit")
	public String e() {
		return "admin/Post_Edit";
	}
}
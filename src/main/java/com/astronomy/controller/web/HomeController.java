package com.astronomy.controller.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.IProductCategoryService;
import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.ProductCategoryEntity;



@Controller(value = "HomeControllerOfWeb")
public class HomeController {

	@Autowired
	IProductCategoryService productCategoryService;
	
	@RequestMapping(value = "/")
	public String index(Model model) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		return "web/index";
	}

	@RequestMapping(value = "login")
	public String login(@RequestParam(required = false) String message, final Model model,
			@ModelAttribute("userDTO") UserCreateModifyDTO dto) {
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

	@RequestMapping(value = "shoppingTools")
	public String shopping() {
		return "web/shopping_tools";
	}
	
	@RequestMapping(value = "contact")
	public String contact1() {
		return "web/contact";
	}
	
	@RequestMapping(value = "shopping_cart")
	public String cart(Model model) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		return "web/shopping_cart";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("USER");
		return "redirect:/login";
	}
}

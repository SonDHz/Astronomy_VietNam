package com.astronomy.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.astronomy.Service.IProductCategoryService;
import com.astronomy.entity.ProductCategoryEntity;

@Controller
public class UserDetailController {
	
	@Autowired
	IProductCategoryService productCategoryService;
	
	@GetMapping(value = "/user-detail")
	public String userDetail(Model model) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		return "/web/user_detail";
	}
	
	@GetMapping(value = "/user-bill-detail")
	public String userBillDetail(Model model) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		return "/web/user_bill_detail";
	}
}

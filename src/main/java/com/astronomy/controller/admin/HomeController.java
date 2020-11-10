package com.astronomy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "HomeControllerOfAdmin")
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "admin/dashboard";
	}
	
	@RequestMapping("/employee")
	public String Account() {
		return "admin/employee_manager";
	}
	
	@RequestMapping("/customer")
	public String Customer() {
		return "admin/customer_manager";
	}
	
	@RequestMapping("/category")
	public String Category() {
		return "admin/category_manager";
	}
	
	@RequestMapping("/post")
	public String Post() {
		return "admin/post_manager";
	}
	
	@RequestMapping("/product")
	public String Product() {
		return "admin/product_manager";
	}
	
	@RequestMapping("/productCategory")
	public String ProductCategory() {
		return "admin/product_category_manager";
	}
	
	@RequestMapping("/manufacturer")
	public String Manufacturer() {
		return "admin/manufacturer_manager";
	}
	
	@RequestMapping("/postCategory")
	public String PostCategory() {
		return "admin/post_category_manager";
	}
	
	@RequestMapping("/order")
	public String Order() {
		return "admin/order_manager";
	}
	
	@RequestMapping("/oderDetail")
	public String OderDetail() {
		return "admin/order_detail_manager";
	}
	
}

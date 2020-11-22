package com.astronomy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "HomeControllerOfAdmin")
public class HomeController {
	
	@RequestMapping("admin/dashboard")
	public String index() {
		return "admin/dashboard";
	}
	
	@RequestMapping("admin/employee")
	public String account() {
		return "admin/employee_manager";
	}
	
	@RequestMapping("admin/customer")
	public String customer() {
		return "admin/customer_manager";
	}
	
	@RequestMapping("admin/category")
	public String category() {
		return "admin/category_manager";
	}
	
	@RequestMapping("admin/post")
	public String post() {
		return "admin/post_manager";
	}
	
	@RequestMapping("admin/product")
	public String product() {
		return "admin/product_manager";
	}
	
	@RequestMapping("admin/productCategory")
	public String productCategory() {
		return "admin/product_category_manager";
	}
	
	@RequestMapping("admin/postCategory")
	public String postCategory() {
		return "admin/post_category_manager";
	}
	
	@RequestMapping("admin/order")
	public String order() {
		return "admin/order_manager";
	}
	
	@RequestMapping("admin/oderDetail")
	public String oderDetail() {
		return "admin/order_detail_manager";
	}
	
}

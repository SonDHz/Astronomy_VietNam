package com.astronomy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "HomeControllerOfAdmin")
@RequestMapping(value = "admin")
public class HomeController {
	
	@RequestMapping("dashboard")
	public String index() {
		return "admin/dashboard";
	}
	
	@RequestMapping("employee")
	public String account() {
		return "admin/employee_manager";
	}
	
	@RequestMapping("customer")
	public String customer() {
		return "admin/customer_manager";
	}
	
	@RequestMapping("category")
	public String category() {
		return "admin/category_manager";
	}
	
	@RequestMapping("post")
	public String post() {
		return "admin/post_manager";
	}
	
	@RequestMapping("product")
	public String product() {
		return "admin/product_manager";
	}
	
	@RequestMapping("productCategory")
	public String productCategory() {
		return "admin/product_category_manager";
	}
	
	@RequestMapping("postCategory")
	public String postCategory() {
		return "admin/post_category_manager";
	}
	
	@RequestMapping("order")
	public String order() {
		return "admin/order_manager";
	}
	
	@RequestMapping("oderDetail")
	public String oderDetail() {
		return "admin/order_detail_manager";
	}
	
}

package com.astronomy.controller.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.astronomy.Service.IOrderDetailService;
import com.astronomy.Service.IOrderService;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.entity.OrderEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller(value = "HomeControllerOfAdmin")
@RequestMapping("admin")
public class HomeController {
	
	
	@Autowired
	private IOrderService orderService;
	
	@Autowired
	private IOrderDetailService orderdetailService;

	
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
	
	@RequestMapping("manufacturer")
	public String manufacturer() {
		return "admin/manufacturer_manager";
	}
	
	@RequestMapping("postCategory")
	public String postCategory() {
		return "admin/post_category_manager";
	}
	
	@RequestMapping("order")
	public String order(Model model) {
		List<OrderEntity> order = orderService.getAll();
		model.addAttribute("order", order);
		return "admin/order_manager";
	}
	
	@RequestMapping("oderDetail")
	public String oderDetail(Model model) {
	List<OrderDetailEntity> orderdetail = orderdetailService.getAll();
		model.addAttribute("orderdetail", orderdetail);
		return "admin/order_detail_manager";
	}
	


	

}

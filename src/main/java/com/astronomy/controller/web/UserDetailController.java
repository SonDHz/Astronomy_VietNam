package com.astronomy.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.astronomy.Service.IOrderDetailService;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.entity.OrderEntity;
import com.astronomy.entity.ProductCategoryEntity;

@Controller
public class UserDetailController {
	
	@Autowired
	private IProductCategoryService productCategoryService;
	
	@Autowired
	private IOrderDetailService orderDetailService;
	
	@GetMapping(value = "/user-detail")
	public String userDetail(Model model) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		return "/web/user_detail";
	}
	
	@GetMapping(value = "/user-bill-detail/{id}")
	public String userBillDetail(Model model, @PathVariable(value = "id") long id) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		List<OrderDetailEntity> listOrderDetailByUserID = orderDetailService.getBillDetailByUserID(id);
		model.addAttribute("listOrderDetailByUserID", listOrderDetailByUserID);
		return "/web/user_bill_detail";
	}
}

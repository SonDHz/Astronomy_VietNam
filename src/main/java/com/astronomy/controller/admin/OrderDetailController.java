//package com.astronomy.controller.admin;
//
//import java.util.*;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import com.astronomy.Service.IOrderDetailService;
//import com.astronomy.Service.IOrderService;
//import com.astronomy.dto.OrderDetailCreateModifyDTO;
//import com.astronomy.entity.OrderDetailEntity;
//import com.astronomy.entity.OrderEntity;
//import com.astronomy.mapper.OrderDetailMapper;
//
//
//@RequestMapping(value = "admin")
//@Controller
//public class OrderDetailController {
//	
//	@Autowired
//	IOrderDetailService orderDetailService;
//
//	@Autowired
//	OrderDetailMapper orderDetailMapper;
//	
//	@Autowired
//	IOrderService orderService;
//
//	@GetMapping("orderDetailView")
//	public String OrderDetailView(Model model) {
//		List<OrderDetailEntity> list = orderDetailService.getAll();
//		model.addAttribute("orderDetail", list);
//		return "admin/order_detail_manager";
//	}
//
//	@GetMapping("createModify/orderDetail")
//	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
//		OrderDetailCreateModifyDTO orderDetaildto = new OrderDetailCreateModifyDTO();
//		if (id != null) {
//			orderDetaildto = orderDetailService.findByIdDTO(id);
//		}
//		model.addAttribute("model", orderDetaildto);
//		return "admin/action/actionOrderDetail";
//	}
//	
//	@ModelAttribute("orders")
//	public List<OrderEntity> getorder(){
//		List<OrderEntity> list = orderService.getAll();
//		return list;
//	}
//}

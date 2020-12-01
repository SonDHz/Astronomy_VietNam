//package com.astronomy.API.admin;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.astronomy.Service.IOrderDetailService;
//import com.astronomy.dto.OrderDetailCreateModifyDTO;
//import com.astronomy.entity.OrderDetailEntity;
//import com.astronomy.mapper.OrderDetailMapper;
//
//@RestController
//@RequestMapping(value = "api")
//public class OrderDetailAPI {
//
//	@Autowired
//	private OrderDetailMapper orderDetailMapper;
//
//	@Autowired
//	private IOrderDetailService orderDetailService;
//
//	@PostMapping("OrderDetail")
//	public ResponseEntity<OrderDetailEntity> createOrderDetail(@RequestBody OrderDetailEntity orderDetailentity, Model model){
//	    System.out.println("Model: " + orderDetailentity);
//		OrderDetailCreateModifyDTO orderDetaildto = orderDetailMapper.toOrderDetailResponserDTO(orderDetailentity);
//		model.addAttribute("model", orderDetaildto);
//		return ResponseEntity.ok(orderDetailMapper.toOrderDetail(orderDetailService.createModify(orderDetaildto)));
//	}
//	
//	@PutMapping("OrderDetail")
//	public ResponseEntity<OrderDetailEntity> updateOrderDetail(@RequestBody OrderDetailEntity orderDetailentity, Model model){
//		OrderDetailCreateModifyDTO orderDetaildto = orderDetailMapper.toOrderDetailResponserDTO(orderDetailentity);
//		model.addAttribute("model", orderDetaildto);
//		return ResponseEntity.ok(orderDetailMapper.toOrderDetail(orderDetailService.createModify(orderDetaildto)));
//	}
//
//	@DeleteMapping("OrderDetail")
//	public void delete(@RequestBody long[] ids) {
//		orderDetailService.delete(ids);
//	}
//
//	@GetMapping("OrderDetail")
//	public List<OrderDetailEntity> getAll() {
//		return orderDetailService.getAll();
//	}
//
//}

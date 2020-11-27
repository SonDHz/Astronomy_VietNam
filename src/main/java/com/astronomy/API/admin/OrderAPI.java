package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.astronomy.Service.IOrderService;
import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;
import com.astronomy.mapper.OrderMapper;

@RestController
@RequestMapping(value = "api")
public class OrderAPI {
	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private IOrderService orderService;

	@PostMapping("Order")
	public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderentity, Model model){
		OrderCreateModifyDTO orderdto = orderMapper.toOrderResponserDTO(orderentity);
		model.addAttribute("model", orderdto);
		return ResponseEntity.ok(orderMapper.toOrder(orderService.createModify(orderdto)));
	}
	
	@PutMapping("Order")
	public ResponseEntity<OrderEntity> updateOrder(@RequestBody OrderEntity orderentity, Model model){
		OrderCreateModifyDTO orderdto = orderMapper.toOrderResponserDTO(orderentity);
		model.addAttribute("model", orderdto);
		return ResponseEntity.ok(orderMapper.toOrder(orderService.createModify(orderdto)));
	}
	

	@DeleteMapping("Order")
	public void delete(@RequestBody long[] ids) {
		orderService.delete(ids);
	}

	@GetMapping("Order")
	public List<OrderEntity> getAll() {
		return orderService.getAll();
	}

}

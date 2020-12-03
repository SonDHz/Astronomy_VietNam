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
	public ResponseEntity<OrderCreateModifyDTO> createOrder(
			@RequestBody OrderCreateModifyDTO dto, Model model){
		OrderEntity entity = orderMapper.toOrder(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(orderMapper.toOrderResponserDTO(orderService.createModify(entity)));
	}
	
	@PutMapping("Order")
	public ResponseEntity<OrderCreateModifyDTO> updateOrder(
			@RequestBody OrderCreateModifyDTO dto, Model model){
		OrderEntity entity = orderMapper.toOrder(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(orderMapper.toOrderResponserDTO(orderService.createModify(entity)));
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
package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.IOrderService;
import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;
import com.astronomy.mapper.OrderMapper;

@RestController
public class OrderAPI {
	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private IOrderService orderService;
	
	@GetMapping(value ="/api/Order")
	public List<OrderEntity> getAll() {
		return orderService.getAll();
	}
	
	@PostMapping(value ="/api/Order")
	public ResponseEntity<OrderCreateModifyDTO> createOrder(@RequestBody OrderCreateModifyDTO dto){
		OrderEntity order = orderMapper.toOrder(dto);
		return ResponseEntity.ok(orderMapper.toOrderResponserDTO(orderService.create(order)));
	}
	
	@PutMapping(value ="/api/Order/{id}")
	public ResponseEntity<OrderCreateModifyDTO> updateOrder(@RequestBody OrderCreateModifyDTO dto, @PathVariable("id") long id){
		dto.setId(id);
		OrderEntity order = orderMapper.toOrder(dto);
		return ResponseEntity.ok(orderMapper.toOrderResponserDTO(orderService.create(order)));
	}
	
	@DeleteMapping("/api/Order/{id}")
	public String deleteOrder(@PathVariable("id") long ids) {
		return orderService.delete(ids);
	}
	
	
}

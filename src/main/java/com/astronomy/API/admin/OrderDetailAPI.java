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
import com.astronomy.Service.IOrderDetailService;
import com.astronomy.dto.OrderDetailCreateModifyDTO;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.mapper.OrderDetailMapper;

@RestController
public class OrderDetailAPI {

	@Autowired
	private OrderDetailMapper orderdetailMapper;

	@Autowired
	private IOrderDetailService orderdetailService;

	@GetMapping(value = "/api/OrderDetail")
	public List<OrderDetailEntity> getAll() {
		return orderdetailService.getAll();
	}

	@PostMapping(value = "/api/OrderDetail")
	public ResponseEntity<OrderDetailCreateModifyDTO> createOrderDetail(@RequestBody OrderDetailCreateModifyDTO dto) {
		OrderDetailEntity orderdetail = orderdetailMapper.toOrderDetail(dto);
		return ResponseEntity
				.ok(orderdetailMapper.toOrderDetailResponserDTO(orderdetailService.createModify(orderdetail)));
	}

	@PutMapping(value = "/api/OrderDetail/{id}")
	public ResponseEntity<OrderDetailCreateModifyDTO> updateOrderDetail(@RequestBody OrderDetailCreateModifyDTO dto,
			@PathVariable("id") long id) {
		dto.setId(id);
		OrderDetailEntity orderdetail = orderdetailMapper.toOrderDetail(dto);
		return ResponseEntity
				.ok(orderdetailMapper.toOrderDetailResponserDTO(orderdetailService.createModify(orderdetail)));
	}

	@DeleteMapping("/api/OrderDetail/{id}")
	public String deleteOrderDetail(@PathVariable("id") long ids) {
		return orderdetailService.delete(ids);
	}

}

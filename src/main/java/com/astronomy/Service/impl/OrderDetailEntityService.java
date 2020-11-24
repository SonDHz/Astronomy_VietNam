package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IOrderDetailService;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.repository.OrderDetailRepository;


@Service
public class OrderDetailEntityService implements IOrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderdetailRepository;
	
	@Override
	public List<OrderDetailEntity> getAll() {
		return orderdetailRepository.findAll();
	}
	
	@Override
	public OrderDetailEntity createModify(OrderDetailEntity orderdetailEntity) {
		return orderdetailRepository.save(orderdetailEntity);
	}

	@Override
	public String delete(Long id) {
		orderdetailRepository.deleteById(id);
		return "Successful";
	}

	
}

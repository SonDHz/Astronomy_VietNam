package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IOrderService;
import com.astronomy.entity.OrderEntity;
import com.astronomy.repository.OrderRepository;

@Service
public class OrderEntityService implements IOrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<OrderEntity> getAll() {
		return orderRepository.findAll();
	}
	
	@Override
	public OrderEntity create(OrderEntity orderEntity) {
		return orderRepository.save(orderEntity); // 1. id == null create / 2. update 
	}
	
	@Override
	public OrderEntity update(OrderEntity orderEntity) {
		return orderRepository.save(orderEntity);
	}
	
	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
		return "Successful";
	}
}

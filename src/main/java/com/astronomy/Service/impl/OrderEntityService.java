package com.astronomy.Service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.astronomy.Service.IOrderService;
import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;
import com.astronomy.mapper.OrderMapper;
import com.astronomy.repository.OrderRepository;

@Service
public class OrderEntityService implements IOrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<OrderEntity> getAll() {
		return orderRepository.findAll();
	}
	
	@Override
	public OrderCreateModifyDTO createModify(OrderCreateModifyDTO orderdto) {
		OrderEntity orderentity = new OrderEntity();
		orderentity = orderMapper.toOrder(orderdto);
		orderentity = orderRepository.save(orderentity);
		return orderdto;
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			orderRepository.deleteById(id);
		}
	}

	@Override
	public OrderCreateModifyDTO findByIdDTO(long id) {
		 OrderEntity orderentity = orderRepository.findById(id).orElse(null);
		return orderMapper.toOrderResponserDTO(orderentity);
	}
	
}

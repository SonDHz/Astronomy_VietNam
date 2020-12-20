package com.astronomy.Service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	//@Override
	//public OrderCreateModifyDTO createModify(OrderCreateModifyDTO orderdto) {
		//OrderEntity orderentity = new OrderEntity();
		//orderentity = orderMapper.toOrder(orderdto);
		//orderentity = orderRepository.save(orderentity);
		//return orderdto;
	//}

	@Override
	public OrderEntity createModify(OrderEntity entity) {
		return orderRepository.save(entity);
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			orderRepository.deleteById(id);
		}
	}

	@Override
	public OrderCreateModifyDTO findByIdDTO(long id) {
		OrderEntity order = orderRepository.findById(id).orElse(null);
		return orderMapper.toOrderResponserDTO(order);
	}

	@Override
	public Map<Long, String> findAll() {
		Map<Long, String> result = new HashMap<>();
		List<OrderEntity> entities = orderRepository.findAll();
		for (OrderEntity item: entities) {
			result.put(item.getId() ,item.getName());
		}
		return result;
	}

	@Override
	public OrderCreateModifyDTO addOrders(OrderCreateModifyDTO dto) {
		System.out.println("Order dto: " + dto);
		OrderEntity entity = orderMapper.toOrder(dto);
		return orderMapper.toOrderResponserDTO(orderRepository.save(entity));
	}
}

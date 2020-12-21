package com.astronomy.Service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IOrderDetailService;
import com.astronomy.dto.CartDTO;
import com.astronomy.dto.MyUser;
import com.astronomy.dto.OrderDetailCreateModifyDTO;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.mapper.OrderDetailMapper;
import com.astronomy.repository.OrderDetailRepository;
import com.astronomy.repository.OrderRepository;


@Service
public class OrderDetailEntityService implements IOrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private OrderDetailMapper orderDetailMapper;

	@Override
	public List<OrderDetailEntity> getAll() {
		return orderDetailRepository.findAll();
	}

	@Override
	public OrderDetailEntity createModify(OrderDetailEntity entity) {
		return orderDetailRepository.save(entity);
	}
	
	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			orderDetailRepository.deleteById(id);
		}
	}

	@Override
	public OrderDetailCreateModifyDTO findByIdDTO(long id) {
		 OrderDetailEntity  orderDetail =  orderDetailRepository.findById(id).orElse(null);
		return orderDetailMapper.toOrderDetailResponserDTO( orderDetail);
	}

	@Override
	public void addOrderDetail(HashMap<Long, CartDTO> cart) {
		long idOrder = orderRepo.getIDLastOrder();
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		for(Map.Entry<Long, CartDTO> item: cart.entrySet()) {
			OrderDetailCreateModifyDTO dto = OrderDetailCreateModifyDTO.builder()
					.userID(((MyUser) principal).getId())//
					.order(idOrder)//
					.product(item.getValue().getProduct().getId())//
					.quantity(item.getValue().getQuanty())//
					.total(item.getValue().getTotalPrice())//
					.build();//
			OrderDetailEntity entity = orderDetailMapper.toOrderDetail(dto);
			System.out.println("entity: " + entity);
			orderDetailRepository.save(entity);
		}
	}
}

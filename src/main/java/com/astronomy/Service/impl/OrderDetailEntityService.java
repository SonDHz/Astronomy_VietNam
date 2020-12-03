package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.astronomy.Service.IOrderDetailService;
import com.astronomy.dto.OrderDetailCreateModifyDTO;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.entity.ProductEntity;
import com.astronomy.mapper.OrderDetailMapper;
import com.astronomy.repository.OrderDetailRepository;


@Service
public class OrderDetailEntityService implements IOrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;

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


	
}

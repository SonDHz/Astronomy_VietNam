//package com.astronomy.Service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.astronomy.Service.IOrderDetailService;
//import com.astronomy.dto.OrderDetailCreateModifyDTO;
//import com.astronomy.entity.OrderDetailEntity;
//import com.astronomy.mapper.OrderDetailMapper;
//import com.astronomy.repository.OrderDetailRepository;
//import com.astronomy.repository.OrderRepository;
//
//@Service
//public class OrderDetailEntityService implements IOrderDetailService {
//	
//	@Autowired
//	private OrderDetailRepository orderDetailRepository;
//
//	@Autowired
//	private OrderDetailMapper orderDetailMapper;
//	
//	@Autowired
//	private OrderRepository repo;
//
//	@Override
//	public List<OrderDetailEntity> getAll() {
//		return orderDetailRepository.findAll();
//	}
//	
//	@Override
//	public OrderDetailCreateModifyDTO createModify(OrderDetailCreateModifyDTO orderDetaildto) {
//		/* Order order = repo.findOneById(orderDetaildto.); */
//		OrderDetailEntity orderDetailentity = new OrderDetailEntity();
//		/* orderDetailentity.setOrder(order); */
//		orderDetailentity = orderDetailMapper.toOrderDetail(orderDetaildto);
//		orderDetailentity = orderDetailRepository.save(orderDetailentity);
//		return orderDetaildto;
//	}
//
//	@Override
//	public void delete(long[] ids) {
//		for (long id: ids) {
//			orderDetailRepository.deleteById(id);
//		}
//	}
//
//	@Override
//	public OrderDetailCreateModifyDTO findByIdDTO(long id) {
//		OrderDetailEntity orderDetailentity = orderDetailRepository.findById(id).orElse(null);
//		return orderDetailMapper.toOrderDetailResponserDTO(orderDetailentity);
//	}
//
//}

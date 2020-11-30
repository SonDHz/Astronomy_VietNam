//package com.astronomy.mapper;
//
//import org.springframework.stereotype.Component;
//
//import com.astronomy.dto.OrderDetailCreateModifyDTO;
//
//import com.astronomy.entity.OrderDetailEntity;
//import com.astronomy.entity.OrderEntity;
//
//@Component
//public class OrderDetailMapper {
//	public OrderDetailEntity toOrderDetail(OrderDetailCreateModifyDTO dto) {
//		System.out.println("Dto: " + dto);
//		OrderEntity order = OrderEntity.builder()
//				.id(dto.getOrder())
//				.build();
//		return OrderDetailEntity.builder()
//				.id(dto.getId())
//				.total(dto.getTotal())
//				.price(dto.getPrice())
//				.quantity(dto.getQuantity())
//				.order(order)
//				.build();
//	}
//	
//	public OrderDetailCreateModifyDTO toOrderDetailResponserDTO(OrderDetailEntity orderdetail) {
//		System.out.println("Entity: " + orderdetail);
//		return OrderDetailCreateModifyDTO.builder()
//				.id(orderdetail.getId())
//				.total(orderdetail.getTotal())
//				.price(orderdetail.getPrice())
//				.quantity(orderdetail.getQuantity())
//				.order(orderdetail.getOrder().getId())
//				.build();
//	}
//}

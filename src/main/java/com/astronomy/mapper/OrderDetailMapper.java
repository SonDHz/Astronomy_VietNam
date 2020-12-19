package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.OrderDetailCreateModifyDTO;

import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.entity.OrderEntity;
import com.astronomy.entity.ProductEntity;

@Component
public class OrderDetailMapper {
	public OrderDetailEntity toOrderDetail(OrderDetailCreateModifyDTO dto) {
		OrderEntity order = OrderEntity.builder()
				.id(dto.getOrder())
				.build();
		ProductEntity product = ProductEntity.builder()
				.id(dto.getProduct())
				.build();
		return OrderDetailEntity.builder()
				.id(dto.getId())
				.total(dto.getTotal())
				.quantity(dto.getQuantity())
				.order(order)
				.product(product)
				.createdDate(dto.getCreatedDate())
				.modifiedDate(dto.getModifiedDate())
				.createdBy(dto.getCreatedBy())
				.modifiedBy(dto.getModifiedBy())
				.build();
	}
	
	public OrderDetailCreateModifyDTO toOrderDetailResponserDTO(OrderDetailEntity orderdetail) {
		System.out.println("Entity: " + orderdetail);
		return OrderDetailCreateModifyDTO.builder()
				.id(orderdetail.getId())
				.total(orderdetail.getTotal())
				.quantity(orderdetail.getQuantity())
				.order(orderdetail.getOrder().getId())
				.product(orderdetail.getProduct().getId())
				.createdDate(orderdetail.getCreatedDate())
				.modifiedDate(orderdetail.getModifiedDate())
				.createdBy(orderdetail.getCreatedBy())
				.modifiedBy(orderdetail.getModifiedBy())
				.build();
	}
}

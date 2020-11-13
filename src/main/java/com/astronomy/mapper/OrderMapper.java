package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.OrderCreateModifyDTO;

import com.astronomy.entity.OrderEntity;


@Component
public class OrderMapper {
	public OrderEntity toOrder(OrderCreateModifyDTO dto) {
		return OrderEntity.builder()
				.id(dto.getId())
				.createBy(dto.getCreateBy())
				.modifyBy(dto.getModifyBy())
				.build();
	}
	
	public OrderCreateModifyDTO toOrderResponserDTO(OrderEntity order) {
		return OrderCreateModifyDTO.builder()
				.id(order.getId())
				.createBy(order.getCreateBy())
				.modifyBy(order.getModifyBy())
				.build();
	}
}

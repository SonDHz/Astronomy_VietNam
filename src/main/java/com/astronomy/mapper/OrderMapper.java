package com.astronomy.mapper;

import org.springframework.stereotype.Component;
import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;

@Component
public class OrderMapper {
	public OrderEntity toOrder(OrderCreateModifyDTO dto) {
		return OrderEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.createdDate(dto.getCreatedDate())
				.modifiedDate(dto.getModifiedDate())
				.createdBy(dto.getCreatedBy())
				.modifiedBy(dto.getModifiedBy())
				.build();
	}
	
	public OrderCreateModifyDTO toOrderResponserDTO(OrderEntity order) {
		return OrderCreateModifyDTO.builder()
				.id(order.getId())
				.name(order.getName())
				.createdDate(order.getCreatedDate())
				.modifiedDate(order.getModifiedDate())
				.createdBy(order.getCreatedBy())
				.modifiedBy(order.getModifiedBy())
				.build();
	}
}

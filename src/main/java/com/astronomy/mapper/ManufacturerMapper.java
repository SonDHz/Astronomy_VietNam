package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;


@Component
public class ManufacturerMapper {
	
	public ManufacturerEntity toManufacturer(ManufacturerCreateModifyDTO dto) {
		return ManufacturerEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.createdBy(dto.getCreatedBy())
				.modifiedDate(dto.getModifiedDate())
				.modifiedBy(dto.getModifiedBy())
				.modifiedDate(dto.getModifiedDate())
				.build();
	}
	
	public ManufacturerCreateModifyDTO toManufacturerResponserDTO(ManufacturerEntity manufacturer) {
		return ManufacturerCreateModifyDTO.builder()
				.id(manufacturer.getId())
				.name(manufacturer.getName())
				.createdBy(manufacturer.getCreatedBy())
				.modifiedDate(manufacturer.getModifiedDate())
				.modifiedBy(manufacturer.getModifiedBy())
				.modifiedDate(manufacturer.getModifiedDate())
				.build();
	}
}

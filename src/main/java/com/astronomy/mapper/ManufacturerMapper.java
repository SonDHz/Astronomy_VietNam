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
				.createBy(dto.getCreateBy())
				.modifyBy(dto.getModifyBy())
				.build();
	}
	
	public ManufacturerCreateModifyDTO toManufacturerResponserDTO(ManufacturerEntity manufacturer) {
		return ManufacturerCreateModifyDTO.builder()
				.id(manufacturer.getId())
				.name(manufacturer.getName())
				.createBy(manufacturer.getCreateBy())
				.modifyBy(manufacturer.getModifyBy())
				.build();
	}
}

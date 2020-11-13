package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.CategoryCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;

@Component
public class CategoryMapper {

	public CategoryEntity toCategory(CategoryCreateModifyDTO dto) {
		return CategoryEntity.builder()
				.id(dto.getId())
				.code(dto.getCode())
				.name(dto.getName())
				.createBy(dto.getCreateBy())
				.modifyBy(dto.getModifyBy())
				.build();
	}
	public CategoryCreateModifyDTO toCategoryCreateModifyDTO(CategoryEntity category) {
		return CategoryCreateModifyDTO.builder()
				.id(category.getId())
				.code(category.getCode())
				.name(category.getName())
				.createBy(category.getCreateBy())
				.modifyBy(category.getModifyBy())
				.build();
	}
	
}

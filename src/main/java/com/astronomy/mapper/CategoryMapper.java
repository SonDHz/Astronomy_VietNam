package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.CategoryCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;

@Component
public class CategoryMapper {

	public CategoryEntity toCategory(CategoryCreateModifyDTO dto) {
		return CategoryEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.createdBy(dto.getCreatedBy())
				.modifiedDate(dto.getModifiedDate())
				.modifiedBy(dto.getModifiedBy())
				.modifiedDate(dto.getModifiedDate())
				.build();
	}
	public CategoryCreateModifyDTO toCategoryCreateModifyDTO(CategoryEntity category) {
		return CategoryCreateModifyDTO.builder()
				.id(category.getId())
				.name(category.getName())
				.createdBy(category.getCreatedBy())
				.modifiedDate(category.getModifiedDate())
				.modifiedBy(category.getModifiedBy())
				.modifiedDate(category.getModifiedDate())
				.build();
	}
	
}

package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategoryEntity;

@Component
public class ProductCategoryMapper {
	public ProductCategoryEntity toProductCategory(ProductCategoryCreateModifyDTO dto) {
		return ProductCategoryEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.createdDate(dto.getCreatedDate())
				.modifiedDate(dto.getModifiedDate())
				.createdBy(dto.getCreatedBy())
				.modifiedBy(dto.getModifiedBy())
				.build();
	}
	public ProductCategoryCreateModifyDTO toProductCategoryResponserDTO(ProductCategoryEntity productCategory) {
		return ProductCategoryCreateModifyDTO.builder()
				.id(productCategory.getId())
				.name(productCategory.getName())
				.createdDate(productCategory.getCreatedDate())
				.modifiedDate(productCategory.getModifiedDate())
				.createdBy(productCategory.getCreatedBy())
				.modifiedBy(productCategory.getModifiedBy())
				.build();
	}
}

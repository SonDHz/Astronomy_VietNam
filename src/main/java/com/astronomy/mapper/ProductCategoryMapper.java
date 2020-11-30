package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategory;

@Component
public class ProductCategoryMapper {
	public ProductCategory toProductCategory(ProductCategoryCreateModifyDTO dto) {
		return ProductCategory.builder()
				.id(dto.getId())
				.name(dto.getName())
				.code(dto.getCode())
				.createdDate(dto.getCreatedDate())//
				.modifiedDate(dto.getModifiedDate())//
				.createdBy(dto.getCreatedBy())//
				.modifiedBy(dto.getModifiedBy())//
				.build();
	}
	public ProductCategoryCreateModifyDTO toProductCategoryResponserDTO(ProductCategory productCategory) {
		return ProductCategoryCreateModifyDTO.builder()
				.id(productCategory.getId())
				.name(productCategory.getName())
				.code(productCategory.getCode())
				.createdDate(productCategory.getCreatedDate())//
				.modifiedDate(productCategory.getModifiedDate())//
				.createdBy(productCategory.getCreatedBy())//
				.modifiedBy(productCategory.getModifiedBy())//
				.build();
	}
}

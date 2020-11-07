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
				.createBy(dto.getCreateBy())
				.modifyBy(dto.getModifyBy())
				.build();
	}
	public ProductCategoryCreateModifyDTO toProductCategoryResponserDTO(ProductCategory productCategory) {
		return ProductCategoryCreateModifyDTO.builder()
				.id(productCategory.getId() != null ? productCategory.getId() : null)
				.name(productCategory.getName())
				.code(productCategory.getCode())
				.createBy(productCategory.getCreateBy())
				.modifyBy(productCategory.getModifyBy())
				.build();
	}
}

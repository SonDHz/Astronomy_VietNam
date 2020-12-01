package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.entity.ProductCategoryEntity;
import com.astronomy.entity.ProductEntity;

@Component
public class ProductMapper {
	public ProductEntity toProduct(ProductCreateModifyDTO dto) {//
		ProductCategoryEntity productCategory = ProductCategoryEntity.builder()//
				.id(dto.getProductCategory())//
				.build();//

		ManufacturerEntity manufacturer = ManufacturerEntity.builder()//
				.id(dto.getManufacturer())//
				.build();//

		return ProductEntity.builder()//
				.id(dto.getId())//
				.name(dto.getName())//
				.shortDecription(dto.getShortDecription())//
				.status(dto.getStatus())//
				.image(dto.getImage())//
				.price(dto.getPrice())//
				.quantity(dto.getQuantity())//
				.createdDate(dto.getCreatedDate())//
				.modifiedDate(dto.getModifiedDate())//
				.createdBy(dto.getCreatedBy())//
				.modifiedBy(dto.getModifiedBy())//
				.productCategory(productCategory)//
				.manufacturer(manufacturer)//
				.build();//
	}

	public ProductCreateModifyDTO toProductResponserDTO(ProductEntity product) {//
		return ProductCreateModifyDTO.builder()//
				.id(product.getId())//
				.name(product.getName())//
				.shortDecription(product.getShortDecription())//
				.status(product.getStatus())//
				.image(product.getImage())//
				.price(product.getPrice())//
				.quantity(product.getQuantity())//
				.createdDate(product.getCreatedDate())//
				.modifiedDate(product.getModifiedDate())//
				.createdBy(product.getCreatedBy())//
				.modifiedBy(product.getModifiedBy())//
				.productCategory(product.getProductCategory().getId())//
				.manufacturer(product.getManufacturer().getId())//
				.build();//
	}
}

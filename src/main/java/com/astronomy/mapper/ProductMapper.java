package com.astronomy.mapper;

import org.springframework.stereotype.Component;


import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.entity.ProductCategory;
import com.astronomy.entity.ProductEntity;

@Component
public class ProductMapper { 
	public ProductEntity toProduct(ProductCreateModifyDTO dto) {
		ProductCategory productCategory =  ProductCategory.builder()
				.id(dto.getProductCategory())
				.build();
		
		 ManufacturerEntity manufacturer =  ManufacturerEntity.builder()
				.id(dto.getManufacturer())
				.build();
		 
		 OrderDetailEntity orderDetail =  OrderDetailEntity.builder()
				.id(dto.getOrderDetail())
				.build();
		  
		return ProductEntity.builder()
				.productCategory(productCategory)
				.manufacturer(manufacturer)
				.orderDetail(orderDetail)
				.id(dto.getId())
				.name(dto.getName())
				.shortDecription(dto.getShortDecription())
				.status(dto.getStatus())
				.image(dto.getImage())
				.price(dto.getPrice())
				.quantity(dto.getQuantity())
				.build();
	}
	
	public ProductCreateModifyDTO toProductResponserDTO(ProductEntity product) {
		return ProductCreateModifyDTO .builder()
				.id(product.getId() != null ? product.getId() : null)
				.name(product.getName())
				.shortDecription(product.getShortDecription())
				.status(product.getStatus())
				.image(product.getImage()) 
				.price(product.getPrice())
				.quantity(product.getQuantity())
				.productCategory(product.getProductCategory().getId())
				.manufacturer(product.getManufacturer().getId())
				.orderDetail(product.getOrderDetail().getId())
				.build();
	}
}

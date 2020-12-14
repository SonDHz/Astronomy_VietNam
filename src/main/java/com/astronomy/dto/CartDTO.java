package com.astronomy.dto;

import com.astronomy.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartDTO {
	private Integer quanty;
	private double totalPrice;
	private ProductEntity product;
}

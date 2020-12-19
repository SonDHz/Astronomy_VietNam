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
	
	public void calAndSetTotalPriceOfProduct() {
		this.setTotalPrice(this.getQuanty() * this.getProduct().getPrice()); 
	}
	
	public void calAndSetTotalPriceOfProduct(int quantity) {
		this.setTotalPrice(quantity * this.getProduct().getPrice()); 
	}
}

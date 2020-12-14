package com.astronomy.Service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.ICartService;
import com.astronomy.Service.IProductService;
import com.astronomy.dto.CartDTO;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.mapper.ProductMapper;

@Service
public class CartImpl implements ICartService {

	@Autowired
	private IProductService productService;

	@Autowired
	private ProductMapper mapper;

	@Override
	public HashMap<Long, CartDTO> addCart(long id, HashMap<Long, CartDTO> cart) {
		CartDTO itemCart = new CartDTO();
		ProductCreateModifyDTO product = mapper.toProductResponserDTO(productService.findByIdEntity(id));
		if(product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart .getQuanty() + 1);
			itemCart.setTotalPrice(itemCart.getQuanty() * itemCart.getProduct().getPrice());
		} else {
			itemCart.setProduct(mapper.toProduct(product));
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(itemCart.getQuanty() * itemCart.getProduct().getPrice());
		}
		
		cart.put(id, itemCart);
		return cart;
	}

	@Override
	public HashMap<Long, CartDTO> editCart(long id, int quanty, HashMap<Long, CartDTO> cart) {
		CartDTO itemCart = new CartDTO();
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)){
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double totalPrice = quanty * itemCart.getProduct().getPrice();
			itemCart.setTotalPrice(totalPrice); 
		}
		cart.put(id, itemCart);
		return cart;
	}

	@Override
	public HashMap<Long, CartDTO> deleteCart(long id, HashMap<Long, CartDTO> cart) {
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	
	@Override
	public int totalQuanty(HashMap<Long, CartDTO> cart) {
		int totalQuanty = 0;
		for(Map.Entry<Long, CartDTO> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}
	
	@Override
	public double totalPrice(HashMap<Long, CartDTO> cart) {
		double totalPrice = 0;
		for(Map.Entry<Long, CartDTO> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}

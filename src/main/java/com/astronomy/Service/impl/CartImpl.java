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
		CartDTO itemCart = null;
		ProductCreateModifyDTO product = mapper.toProductResponserDTO(productService.findByIdEntity(id));
		
		//containsKey will check id in the cart exist or not
		boolean isExistProduct = product != null && cart.containsKey(id);
		
		if(isExistProduct) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty() + 1);
		} else {
			itemCart = new CartDTO();
			itemCart.setProduct(mapper.toProduct(product));
			itemCart.setQuanty(1);
		}
		
		itemCart.calAndSetTotalPriceOfProduct();
		cart.put(id, itemCart);
		return cart;
	}

	@Override
	public HashMap<Long, CartDTO> editCart(long id, int quantity, HashMap<Long, CartDTO> cart) {
		boolean isExistProduct = cart != null && cart.containsKey(id);
		if(isExistProduct) {
			CartDTO itemCart = cart.get(id);
			itemCart.setQuanty(quantity);
			itemCart.calAndSetTotalPriceOfProduct(quantity); 
			cart.put(id, itemCart);
		}		
		return cart;
	}

	@Override
	public HashMap<Long, CartDTO> deleteCart(long id, HashMap<Long, CartDTO> cart) {
		boolean isExistProduct = cart != null && cart.containsKey(id);
		
		if(isExistProduct) {
			cart.remove(id);
		}
		return cart;
	}
}

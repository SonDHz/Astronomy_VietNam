package com.astronomy.Utils;

import static com.astronomy.constant.EConstant.SESSION_CART;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import com.astronomy.dto.CartDTO;

public class CartUtils {
	/**
	 * Get the Cart from HttpSession. If the Cart is null, initial new Cart.
	 * @param session instance of HttpSession
	 * @return The Cart instance of HashMap  
	 */
	@SuppressWarnings("unchecked")
	public static HashMap<Long, CartDTO> getOrInitialCart(HttpSession session) {
		Object cart = session.getAttribute(SESSION_CART.name());
		if(cart != null) {
			return (HashMap<Long, CartDTO>) cart;
		}
		return new HashMap<Long, CartDTO>();
	}
	
	//a = [{a: "123", quantity: 10, c: false},{a: "321", quantity: 11, c: false}]
	// => int[] result = new int[a.size()];
	// for(int i = 0; i < result.length; i++){result[i] = a[i].quantity}	
	//[10,11]. -->
	
	/**
	 * Calculate the total of product's quantities in Cart
	 * @param cart must be not null
	 * @return total of product's quantities in Cart
	 */
	public static int calQuantities(HashMap<Long, CartDTO> cart) {
		return cart.values().stream().mapToInt(c -> c.getQuanty()).sum();
	}
	
	/**
	 * Calculate the total of product's prices in Cart
	 * @param cart must be not null
	 * @return total of product's prices in Cart
	 */
	public static double calPrices(HashMap<Long, CartDTO> cart) {
		return cart.values().stream().mapToDouble(c -> c.getTotalPrice()).sum();
	}
}

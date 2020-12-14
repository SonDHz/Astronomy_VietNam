package com.astronomy.Service;

import java.util.HashMap;

import com.astronomy.dto.CartDTO;

public interface ICartService {
	HashMap<Long, CartDTO> addCart(long id, HashMap<Long, CartDTO> cart);
	HashMap<Long, CartDTO> editCart(long id, int quanty, HashMap<Long, CartDTO> cart);
	HashMap<Long, CartDTO> deleteCart(long id, HashMap<Long, CartDTO> cart);
	int totalQuanty(HashMap<Long, CartDTO> cart);
	double totalPrice(HashMap<Long, CartDTO> cart);
}

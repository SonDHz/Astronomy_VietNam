package com.astronomy.repository;

import java.util.HashMap;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astronomy.dto.CartDTO;

public interface CartRepository {
	public HashMap<Long, CartDTO> addCart(long id, HashMap<Long, CartDTO> cart);
	public HashMap<Long, CartDTO> editCart(long id, int quanty, HashMap<Long, CartDTO> cart);
	public HashMap<Long, CartDTO> deleteCart(long id, HashMap<Long, CartDTO> cart);
	public int totalQuanty(HashMap<Long, CartDTO> cart);
	public double totalPrice(HashMap<Long, CartDTO> cart);
}
 
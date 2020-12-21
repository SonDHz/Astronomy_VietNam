package com.astronomy.Service;

import java.util.HashMap;
import java.util.List;

import com.astronomy.dto.CartDTO;
import com.astronomy.dto.OrderDetailCreateModifyDTO;
import com.astronomy.entity.OrderDetailEntity;

public interface IOrderDetailService {
	
	List <OrderDetailEntity> getAll();
	
	OrderDetailEntity createModify(OrderDetailEntity dto);
	
	OrderDetailCreateModifyDTO findByIdDTO(long id);
	
	public List<OrderDetailEntity> getBillDetailByUserID(long id);
	
	void addOrderDetail(HashMap<Long, CartDTO> cart);
	
	void delete(long[] ids);
	
}
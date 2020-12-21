package com.astronomy.Service;
import java.util.*;

import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;

public interface IOrderService {
	
	List <OrderEntity> getAll();
	
	Map<Long, String> findAll();
	
	//OrderCreateModifyDTO createModify(OrderCreateModifyDTO orderdto);
	
	OrderCreateModifyDTO addOrders(OrderCreateModifyDTO dto);
	
	OrderEntity createModify(OrderEntity entity);
	
	OrderCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
	public int countOrder();
}

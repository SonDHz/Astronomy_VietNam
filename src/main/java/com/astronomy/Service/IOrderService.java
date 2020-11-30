package com.astronomy.Service;
import java.util.*;

import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;

public interface IOrderService {
	
	List <OrderEntity> getAll();
	
	OrderCreateModifyDTO createModify(OrderCreateModifyDTO orderdto);
	
	OrderCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
}

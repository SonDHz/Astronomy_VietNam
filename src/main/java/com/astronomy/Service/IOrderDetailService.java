package com.astronomy.Service;

import java.util.List;
import com.astronomy.dto.OrderDetailCreateModifyDTO;
import com.astronomy.entity.OrderDetailEntity;

public interface IOrderDetailService {
	
	List <OrderDetailEntity> getAll();
	
	OrderDetailEntity createModify(OrderDetailEntity dto);
	
	OrderDetailCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
}
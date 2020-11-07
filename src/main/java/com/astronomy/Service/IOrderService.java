package com.astronomy.Service;
import java.util.List;

import com.astronomy.entity.OrderEntity;

public interface IOrderService {
	List <OrderEntity> getAll();
	OrderEntity create(OrderEntity orderEntity);
	OrderEntity update(OrderEntity orderEntity);
	String delete (Long id);
}

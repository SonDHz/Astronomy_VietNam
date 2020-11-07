package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.OrderDetailEntity;


public interface IOrderDetailService {
	List <OrderDetailEntity> getAll();
	OrderDetailEntity create(OrderDetailEntity orderdetailEntity);
	OrderDetailEntity update(OrderDetailEntity orderdetailEntity);
	String delete (Long id);
}

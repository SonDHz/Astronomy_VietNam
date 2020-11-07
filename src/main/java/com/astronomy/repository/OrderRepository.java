package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.astronomy.entity.OrderEntity;


public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
		
}

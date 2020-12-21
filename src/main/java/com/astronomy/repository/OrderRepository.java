package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astronomy.entity.OrderEntity;


public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
		
	@Query(value = "SELECT MAX(id) FROM orders;", nativeQuery = true)
	public long getIDLastOrder(); 
	
	@Query(value = "SELECT COUNT(*) FROM orders;", nativeQuery = true)
	public int countOrder(); 
}

package com.astronomy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.entity.UserEntity;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {
	
	@Query(value = "select u.* from user u left join role ul on u.id = ul.userid where code = USER", nativeQuery = true)
	public List<UserEntity> getAllCustomer(); //
}

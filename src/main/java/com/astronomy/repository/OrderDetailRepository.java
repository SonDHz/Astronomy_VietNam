package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.astronomy.entity.OrderDetailEntity;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {

}

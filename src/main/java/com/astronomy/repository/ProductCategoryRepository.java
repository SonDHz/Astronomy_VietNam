package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astronomy.entity.ProductCategoryEntity;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long>  {
	 
}

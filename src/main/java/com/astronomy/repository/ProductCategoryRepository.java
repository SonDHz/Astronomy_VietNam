package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astronomy.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>  {
	 
}

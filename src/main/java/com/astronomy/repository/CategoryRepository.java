package com.astronomy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astronomy.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

	@Query(value = "SELECT * FROM category", nativeQuery = true)
	public List<CategoryEntity> getAll();
	
}

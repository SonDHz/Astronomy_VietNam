package com.astronomy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.astronomy.entity.ProductEntity;
import com.astronomy.entity.UserEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

	@Query(value = "SELECT COUNT(*) FROM product", nativeQuery = true)
	List<Object> countProduct();
	
	@Query(value = "select p.* from product p left join productcategory prc on  p.productcategory_id  = prc.id where productcategory_id=1 ",
			nativeQuery = true)
	public List<ProductEntity> getProduct1(); 
	
	@Query(value = "select p.* from product p left join productcategory prc on  p.productcategory_id  = prc.id where productcategory_id=2 ",
			nativeQuery = true)
	public List<ProductEntity> getProduct2(); 
	
}

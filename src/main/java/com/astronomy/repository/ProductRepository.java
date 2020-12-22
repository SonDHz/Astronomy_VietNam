package com.astronomy.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.astronomy.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

	@Query(value = "SELECT COUNT(*) FROM product", nativeQuery = true)
	public int countProduct();
	
	@Query(value = "select p.* from product p left join productcategory prc on  p.productcategory_id  = prc.id where productcategory_id= ?",
			nativeQuery = true)
	public List<ProductEntity> getProductByCategory(long id);
	
	@Query(value = "select * from product where name like %?1% ",
			nativeQuery = true)
	public List<ProductEntity> getProductSearch(String keyword);
	
//	List<ProductEntity> findByNameIgnoreCase(String lastname);
}

package com.astronomy.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;

public interface IProductService {
	
	List <ProductEntity> getAll();
	
	Page<ProductEntity> getAll( int pageNo, int pageSize);
	
	ProductEntity createModify(ProductEntity dto);
	
	ProductCreateModifyDTO findByIdDTO(long id);
	
	ProductEntity findByIdEntity(long id);
	
	public int count();
	
	void delete(long[] ids);
	
	List<ProductEntity> getProductByCategory(long id);
	
	Page<ProductEntity> getProductPaging( int pageNo, int pageSize);
	
	List<ProductEntity> getProductSearch(String keyword);
	
	Double labelForChart();

}

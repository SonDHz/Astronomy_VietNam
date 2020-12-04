package com.astronomy.Service;

import java.util.List;
import java.util.Map;

import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategoryEntity;

public interface IProductCategoryService {
	
	List <ProductCategoryEntity> getAll();
	
	ProductCategoryEntity createModify(ProductCategoryEntity entity);
	
	void delete( long[] ids);
	
	ProductCategoryCreateModifyDTO findByIdDTO(long id);
	
	Map<Long, String> findAll();

}


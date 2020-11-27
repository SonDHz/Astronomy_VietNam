package com.astronomy.Service;

import java.util.List;

import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategory;

public interface IProductCategoryService {
	
	List <ProductCategory> getAll();
	
	ProductCategoryCreateModifyDTO createModify(ProductCategoryCreateModifyDTO productCategorydto);
	
	ProductCategoryCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
}

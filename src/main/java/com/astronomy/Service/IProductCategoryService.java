package com.astronomy.Service;

import java.util.List;

import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategory;

public interface IProductCategoryService {
	
	List <ProductCategory> getAll();
	
	ProductCategoryCreateModifyDTO createModify(ProductCategoryCreateModifyDTO dto);
	
	void delete( long[] ids);
	
	ProductCategoryCreateModifyDTO findByIdDTO(long id);


}


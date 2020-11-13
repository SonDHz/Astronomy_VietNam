package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.ProductCategory;

public interface IProductCategoryService {
	
	List <ProductCategory> getAll();
	
	ProductCategory createModify(ProductCategory productCategory);
	
	void delete( long[] ids);
}

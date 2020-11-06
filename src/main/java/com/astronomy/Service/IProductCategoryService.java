package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.ProductCategory;

public interface IProductCategoryService {
	ProductCategory create(ProductCategory productCategory);
	ProductCategory update(ProductCategory productCategory);
	void delete( long[] ids);
	List <ProductCategory> getAll();
}

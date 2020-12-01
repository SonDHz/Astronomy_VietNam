package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.ProductEntity;

public interface IProductService {
	
	void delete( long[] ids);
	
	List <ProductEntity> getAll();
	
	ProductEntity createModify(ProductEntity productEntity);
	
}

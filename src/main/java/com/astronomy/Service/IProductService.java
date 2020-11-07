package com.astronomy.Service;

import java.util.List;


import com.astronomy.entity.ProductEntity;

public interface IProductService {
	ProductEntity create(ProductEntity productEntity);
	ProductEntity update(ProductEntity productEntity);
	void delete( long[] ids);
	List <ProductEntity> getAll();
}

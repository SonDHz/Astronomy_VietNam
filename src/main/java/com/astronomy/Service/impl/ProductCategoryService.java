package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IProductCategoryService;
import com.astronomy.entity.ProductCategory;
import com.astronomy.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService implements IProductCategoryService {

	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@Override
	public ProductCategory create(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryRepository.save(productCategory);
	}

	@Override
	public ProductCategory update(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryRepository.save(productCategory);
	}

	@Override
	public void delete(long[] ids) {
		for (long item : ids ) {
			productCategoryRepository.deleteById(item);
		}	
	}
	@Override
	public List<ProductCategory> getAll() {
		// TODO Auto-generated method stub
		return productCategoryRepository.findAll();
	}

}

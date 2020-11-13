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
	public List<ProductCategory> getAll() {
		return productCategoryRepository.findAll();
	}
	
	@Override
	public ProductCategory createModify(ProductCategory productCategory) {
		return productCategoryRepository.save(productCategory);
	}

	@Override
	public void delete(long[] ids) {
		for (long item : ids) {
			productCategoryRepository.deleteById(item);
		}
	}
}

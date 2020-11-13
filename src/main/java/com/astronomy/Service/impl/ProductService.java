package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IProductService;
import com.astronomy.entity.ProductEntity;
import com.astronomy.repository.ProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<ProductEntity> getAll() {
		return productRepository.findAll();
	}
	
	@Override
	public ProductEntity createModify(ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}
	
	@Override
	public void delete(long[] ids) {
		for (long item : ids) {
			productRepository.deleteById(item);
		}
	}
}

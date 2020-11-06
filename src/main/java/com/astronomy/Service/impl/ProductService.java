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
	public ProductEntity create(ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}

	@Override
	public ProductEntity update(ProductEntity productEntity) {
		// TODO Auto-generated method stub
		return productRepository.save(productEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		for (long item : ids ) {
			productRepository.deleteById(item);
		}	
		
	}

	@Override
	public List<ProductEntity> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	

}

package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IProductCategoryService;
import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategory;
import com.astronomy.mapper.ProductCategoryMapper;
import com.astronomy.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService implements IProductCategoryService {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@Autowired
	private ProductCategoryMapper 	productCategoryMapper;
	
	@Override
	public List<ProductCategory> getAll() {
		return productCategoryRepository.findAll();
	}
	
	@Override
	public ProductCategoryCreateModifyDTO createModify(ProductCategoryCreateModifyDTO productCategorydto) {
		ProductCategory productCategory = new ProductCategory();
		productCategory = productCategoryMapper.toProductCategory(productCategorydto);
		productCategory = productCategoryRepository.save(productCategory);
		return productCategorydto;
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			productCategoryRepository.deleteById(id);
		}
	}

	@Override
	public ProductCategoryCreateModifyDTO findByIdDTO(long id) {
		ProductCategory productCategory = productCategoryRepository.findById(id).orElse(null);
		return productCategoryMapper.toProductCategoryResponserDTO(productCategory);
	}
}

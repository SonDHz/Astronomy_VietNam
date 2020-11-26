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
	private ProductCategoryMapper mapper;
	
	@Override
	public List<ProductCategory> getAll() {
		return productCategoryRepository.findAll();
	}
	
//	@Override
//	public ProductCategory createModify(ProductCategory productCategory) {
//		return productCategoryRepository.save(productCategory);
//	}
	
	@Override
	public ProductCategoryCreateModifyDTO createModify(ProductCategoryCreateModifyDTO dto) {
		ProductCategory entity = new ProductCategory();
		entity = mapper.toProductCategory(dto);
		entity = productCategoryRepository.save(entity);
		return dto;
	}

	@Override
	public void delete(long[] ids) {
		for (long item : ids) {
			productCategoryRepository.deleteById(item);
		}
	}
	
	@Override
	public ProductCategoryCreateModifyDTO findByIdDTO(long id) {
		ProductCategory productCategory = productCategoryRepository.findById(id).orElse(null);
		return mapper.toProductCategoryResponserDTO(productCategory);
	}
}

package com.astronomy.Service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IProductCategoryService;
import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategoryEntity;
import com.astronomy.mapper.ProductCategoryMapper;
import com.astronomy.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService implements IProductCategoryService {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@Autowired
	private ProductCategoryMapper 	productCategoryMapper;
	
	@Override
	public List<ProductCategoryEntity> getAll() {
		return productCategoryRepository.findAll();
	}
	
	/*
	 * @Override public ProductCategoryCreateModifyDTO
	 * createModify(ProductCategoryCreateModifyDTO productCategorydto) {
	 * ProductCategoryEntity productCategory = new ProductCategoryEntity();
	 * productCategory =
	 * productCategoryMapper.toProductCategory(productCategorydto); productCategory
	 * = productCategoryRepository.save(productCategory); return productCategorydto;
	 * }
	 */

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			productCategoryRepository.deleteById(id);
		}
	}

	@Override
	public ProductCategoryCreateModifyDTO findByIdDTO(long id) {
		ProductCategoryEntity productCategory = productCategoryRepository.findById(id).orElse(null);
		return productCategoryMapper.toProductCategoryResponserDTO(productCategory);
	}

	@Override
	public Map<Long, String> findAll() {
		Map<Long, String> result = new HashMap<>();
		List<ProductCategoryEntity> entities = productCategoryRepository.findAll();
		for (ProductCategoryEntity item: entities) {
			result.put(item.getId(), item.getName());
		}
		return result;
	}

	@Override
	public ProductCategoryEntity createModify(ProductCategoryEntity entity) {
		return productCategoryRepository.save(entity);
	}
}


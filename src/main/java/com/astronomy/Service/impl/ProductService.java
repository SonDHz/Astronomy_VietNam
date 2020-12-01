package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IProductService;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;
import com.astronomy.mapper.ProductMapper;
import com.astronomy.repository.ProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductMapper mapper;

	@Override
	public List<ProductEntity> getAll() {
		return productRepository.findAll();
	}
	
//	@Override
//	public ProductCreateModifyDTO createModify(ProductCreateModifyDTO dto) {
//		ProductEntity entity = new ProductEntity();
//		entity = mapper.toProduct(dto);
//		entity = mapper.toProductResponserDTO(product)
//		entity = productRepository.save(entity);
//		return entity;
//	}
	
	@Override
	public ProductEntity createModify(ProductEntity entity) {
		return productRepository.save(entity);
	}
	
	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			productRepository.deleteById(id);
		}
	}

	@Override
	public ProductCreateModifyDTO findByIdDTO(long id) {
		ProductEntity product = productRepository.findById(id).orElse(null);
		return mapper.toProductResponserDTO(product);
	}
}

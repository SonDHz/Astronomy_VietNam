package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
		System.out.println("product: " + product.getProductCategory());
		return mapper.toProductResponserDTO(product);
	}

	@Override
	public Page<ProductEntity> getAll(int pageNo, int pageSize) {
		return productRepository.findAll(PageRequest.of(pageNo -1, pageSize));
	}

	@Override
	public List<Object> count() {
		return productRepository.countProduct();
	}

	@Override
	public ProductEntity findByIdEntity(long id) {
		ProductEntity product = productRepository.findById(id).orElse(null);
		return product;
	}
}

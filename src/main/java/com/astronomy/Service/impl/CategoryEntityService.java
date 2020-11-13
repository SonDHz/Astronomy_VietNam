package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.CategoryService;
import com.astronomy.entity.CategoryEntity;
import com.astronomy.repository.CategoryRepository;

@Service
public class CategoryEntityService implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<CategoryEntity> getAll() {
		return categoryRepository.getAll();
	}
	
	@Override
	public CategoryEntity createModify(CategoryEntity categoryEntity) {
		return categoryRepository.save(categoryEntity);
	}
	
	@Override
	public void delete(long[] ids) {
		for(long item: ids) {
			categoryRepository.deleteById(item);
		}
	}

}

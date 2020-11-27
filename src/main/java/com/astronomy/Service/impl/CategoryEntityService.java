package com.astronomy.Service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.CategoryService;
import com.astronomy.dto.CategoryCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;
import com.astronomy.mapper.CategoryMapper;
import com.astronomy.repository.CategoryRepository;

@Service
@Transactional
public class CategoryEntityService implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<CategoryEntity> getAll() {
		return categoryRepository.getAll();
	}
	
	@Override
	public CategoryCreateModifyDTO createModify(CategoryCreateModifyDTO categorydto) {
		CategoryEntity categoryentity = new CategoryEntity();
		categoryentity = categoryMapper.toCategory(categorydto);
		categoryentity = categoryRepository.save(categoryentity);
		return categorydto;
	}
	
	@Override
	public void delete(long[] ids) {
		for(long item: ids) {
			categoryRepository.deleteById(item);
		}
	}


	@Override
	public CategoryCreateModifyDTO findByIdDTO(long id) {
		CategoryEntity categoryentity = categoryRepository.findById(id).orElse(null);
		return categoryMapper.toCategoryCreateModifyDTO(categoryentity);
	}

}

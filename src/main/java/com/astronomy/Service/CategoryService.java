package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.CategoryEntity;

public interface CategoryService {

	List<CategoryEntity> getAll();
	
	CategoryEntity createModify(CategoryEntity categoryEntity);
	
	void delete(long[] ids);
	
}

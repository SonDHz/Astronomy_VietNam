package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.CategoryEntity;

public interface CategoryService {
	
	CategoryEntity create(CategoryEntity categoryEntity);
	
	void delete(long[] ids);
	
	List<CategoryEntity> getAll();

}

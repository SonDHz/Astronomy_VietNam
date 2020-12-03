package com.astronomy.Service;

import java.util.List;
import java.util.Map;

import com.astronomy.dto.CategoryCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;

public interface CategoryService {
	
	List<CategoryEntity> getAll();
	
	CategoryEntity createModify(CategoryEntity entity);
	
	CategoryCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
	Map<Long, String> findAll();
	
}

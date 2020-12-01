package com.astronomy.Service;

import java.util.List;
import java.util.Map;

import com.astronomy.dto.CategoryCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;

public interface CategoryService {
	
	List<CategoryEntity> getAll();
	
	CategoryCreateModifyDTO createModify(CategoryCreateModifyDTO categorydto);
	
	CategoryCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
}

package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.CategoryService;
import com.astronomy.dto.CategoryCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;
import com.astronomy.mapper.CategoryMapper;

@RestController
public class CategoryAPI {

	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired
	private CategoryService categoryService;

	@GetMapping("api/category")
	public List<CategoryEntity> getAll() {
		return categoryService.getAll();
	}

	@PostMapping("api/category")
	public ResponseEntity<CategoryCreateModifyDTO> createCategory(@RequestBody CategoryCreateModifyDTO dto) {
		CategoryEntity category = categoryMapper.toCategory(dto);
		System.out.println("catefory: " + category);
		return ResponseEntity.ok(categoryMapper.toCategoryCreateModifyDTO(categoryService.create(category)));
	}

	@PutMapping("api/category/{id}")
	public ResponseEntity<CategoryCreateModifyDTO> updateCategory(@RequestBody CategoryCreateModifyDTO dto,
			@PathVariable("id") long id) {
		dto.setId(id);
		CategoryEntity category = categoryMapper.toCategory(dto);
		return ResponseEntity.ok(categoryMapper.toCategoryCreateModifyDTO(categoryService.create(category)));
	}

	@DeleteMapping(value = "api/category")
	public void deleteCategory(@RequestBody long[] ids) {
		categoryService.delete(ids);
	}

}

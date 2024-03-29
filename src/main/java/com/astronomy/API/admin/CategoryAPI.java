package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.astronomy.Service.CategoryService;
import com.astronomy.dto.CategoryCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;
import com.astronomy.mapper.CategoryMapper;

@RestController
@RequestMapping(value = "api")
public class CategoryAPI {

	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("Category")
	public ResponseEntity<CategoryCreateModifyDTO> createCategory(
			@RequestBody CategoryCreateModifyDTO dto, Model model){
		CategoryEntity entity = categoryMapper.toCategory(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(categoryMapper.toCategoryCreateModifyDTO(categoryService.createModify(entity)));
	}
	
	@PutMapping("Category")
	public ResponseEntity<CategoryCreateModifyDTO> updateCategory(
			@RequestBody CategoryCreateModifyDTO dto, Model model){
		CategoryEntity entity = categoryMapper.toCategory(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(categoryMapper.toCategoryCreateModifyDTO(categoryService.createModify(entity)));
	}

	@DeleteMapping("Category")
	public void delete(@RequestBody long[] ids) {
		categoryService.delete(ids);
	}

	@GetMapping("Category")
	public List<CategoryEntity> getAll() {
		return categoryService.getAll();
	}
}

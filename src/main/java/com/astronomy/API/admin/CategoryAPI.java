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
	public ResponseEntity<CategoryEntity> createCategory(@RequestBody CategoryEntity categoryentity, Model model){
		CategoryCreateModifyDTO categorydto = categoryMapper.toCategoryCreateModifyDTO(categoryentity);
		model.addAttribute("model", categorydto);
		return ResponseEntity.ok(categoryMapper.toCategory(categoryService.createModify(categorydto)));
	}
	
	@PutMapping("Category")
	public ResponseEntity<CategoryEntity> updateCategory(@RequestBody CategoryEntity categoryentity, Model model){
		CategoryCreateModifyDTO categorydto = categoryMapper.toCategoryCreateModifyDTO(categoryentity);
		model.addAttribute("model", categorydto);
		return ResponseEntity.ok(categoryMapper.toCategory(categoryService.createModify(categorydto)));
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

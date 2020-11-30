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
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategory;
import com.astronomy.mapper.ProductCategoryMapper;

@RestController
@RequestMapping(value = "api")
public class ProductCategoryAPI {
	@Autowired
	private ProductCategoryMapper productCategoryMapper;

	@Autowired
	private IProductCategoryService productCategoryService;

	@PostMapping("ProductCategory")
	public ResponseEntity<ProductCategory> createProductCategory(@RequestBody ProductCategory productCategory, Model model){
		ProductCategoryCreateModifyDTO productCategorydto = productCategoryMapper.toProductCategoryResponserDTO(productCategory);
		model.addAttribute("model", productCategorydto);
		return ResponseEntity.ok(productCategoryMapper.toProductCategory(productCategoryService.createModify(productCategorydto)));
	}
	
	@PutMapping("ProductCategory")
	public ResponseEntity<ProductCategory> updateProductCategory(@RequestBody ProductCategory productCategory, Model model){
		ProductCategoryCreateModifyDTO productCategorydto = productCategoryMapper.toProductCategoryResponserDTO(productCategory);
		model.addAttribute("model", productCategorydto);
		return ResponseEntity.ok(productCategoryMapper.toProductCategory(productCategoryService.createModify(productCategorydto)));
	}
	
	@DeleteMapping("ProductCategory")
	public void delete(@RequestBody long[] ids) {
		productCategoryService.delete(ids);
	}

	@GetMapping("ProductCategory")
	public List<ProductCategory> getAll() {
		return productCategoryService.getAll();
	}
}
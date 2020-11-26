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
	public ResponseEntity<ProductCategory> createManufacturer(
			@RequestBody ProductCategory entity, Model model){
		ProductCategoryCreateModifyDTO dto = productCategoryMapper.toProductCategoryResponserDTO(entity);
		model.addAttribute("model", dto);
		return ResponseEntity
				.ok(productCategoryMapper.toProductCategory(productCategoryService.createModify(dto)));
	}

//	@PutMapping("ProductCategory/{id}")
//	public ResponseEntity<ProductCategoryCreateModifyDTO> createProductCategory(
//			@RequestBody ProductCategoryCreateModifyDTO dto, @PathVariable("id") long id) {
//		dto.setId(id);
//		ProductCategory productCategory = productCategoryMapper.toProductCategory(dto);
//		return ResponseEntity.ok(productCategoryMapper
//				.toProductCategoryResponserDTO(productCategoryService.createModify(productCategory)));
//	}

	@PutMapping("ProductCategory")
	public ResponseEntity<ProductCategory> updateProductcategory(
			@RequestBody ProductCategory entity, Model model){
		ProductCategoryCreateModifyDTO dto = productCategoryMapper.toProductCategoryResponserDTO(entity);
		model.addAttribute("model", dto);
		return ResponseEntity
				.ok(productCategoryMapper.toProductCategory(productCategoryService.createModify(dto)));
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

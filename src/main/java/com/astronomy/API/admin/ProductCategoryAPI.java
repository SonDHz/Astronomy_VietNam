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
import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.entity.ProductCategoryEntity;
import com.astronomy.mapper.ProductCategoryMapper;

@RestController
@RequestMapping(value = "api")
public class ProductCategoryAPI {
	@Autowired
	private ProductCategoryMapper productCategoryMapper;

	@Autowired
	private IProductCategoryService productCategoryService;

	@PostMapping("ProductCategory")
	public ResponseEntity<ProductCategoryCreateModifyDTO> createProductCategory(
			@RequestBody ProductCategoryCreateModifyDTO dto, Model model){
		ProductCategoryEntity entity = productCategoryMapper.toProductCategory(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(productCategoryMapper.toProductCategoryResponserDTO(productCategoryService.createModify(entity)));
	}
	
	@PutMapping("ProductCategory")
	public ResponseEntity<ProductCategoryCreateModifyDTO> updateProductCategory(
			@RequestBody ProductCategoryCreateModifyDTO dto, Model model){
		ProductCategoryEntity entity = productCategoryMapper.toProductCategory(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(productCategoryMapper.toProductCategoryResponserDTO(productCategoryService.createModify(entity)));
	}
	
	@DeleteMapping("ProductCategory")
	public void delete(@RequestBody long[] ids) {
		productCategoryService.delete(ids);
	}

	@GetMapping("ProductCategory")
	public List<ProductCategoryEntity> getAll() {
		return productCategoryService.getAll();
	}
}
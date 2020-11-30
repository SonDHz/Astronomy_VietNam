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
import org.springframework.web.bind.annotation.RestController;
import com.astronomy.Service.IProductService;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;
import com.astronomy.mapper.ProductMapper;

@RestController
public class ProductAPI {
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private IProductService productService;

	@PostMapping("Product")
	public ResponseEntity<ProductEntity> createProduct(
			@RequestBody ProductEntity entity, Model model){
		System.out.println("add 01");
		ProductCreateModifyDTO dto = productMapper.toProductResponserDTO(entity);
		System.out.println("add 02");
		model.addAttribute("model", dto);
		System.out.println("add 03");
		return ResponseEntity.ok(productMapper.toProduct(productService.createModify(dto)));
	}
	
	@PutMapping("Product")
	public ResponseEntity<ProductEntity> updateProduct(
			@RequestBody ProductEntity entity, Model model){
		ProductCreateModifyDTO dto = productMapper.toProductResponserDTO(entity);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(productMapper.toProduct(productService.createModify(dto)));
	}

	@DeleteMapping("Product")
	public void delete(@RequestBody long[] ids) {
		productService.delete(ids);
	}

	@GetMapping("Product")
	public List<ProductEntity> getAll() {
		return productService.getAll();
	}
}

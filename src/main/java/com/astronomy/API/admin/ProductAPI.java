//package com.astronomy.API.admin;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.astronomy.Service.IProductService;
//import com.astronomy.dto.ProductCreateModifyDTO;
//import com.astronomy.entity.ProductEntity;
//import com.astronomy.mapper.ProductMapper;
//
//@RestController
//public class ProductAPI {
//	@Autowired
//	private ProductMapper productMapper;
//
//	@Autowired
//	private IProductService productService;
//
//	@PostMapping("/api/Product")
//	public ResponseEntity<ProductCreateModifyDTO> createProduct(@RequestBody ProductCreateModifyDTO dto) {
//		ProductEntity product = productMapper.toProduct(dto);
//		System.out.println("product: " + product);
//		return ResponseEntity.ok(productMapper.toProductResponserDTO(productService.createModify(product)));
//	}
//
//	@PutMapping("/api/Product/{id}")
//	public ResponseEntity<ProductCreateModifyDTO> createProduct(@RequestBody ProductCreateModifyDTO dto,
//			@PathVariable("id") long id) {
//		dto.setId(id);
//		ProductEntity product = productMapper.toProduct(dto);
//		return ResponseEntity.ok(productMapper.toProductResponserDTO(productService.createModify(product)));
//	}
//
//	@DeleteMapping("/api/Product")
//	public void delete(@RequestBody long[] ids) {
//		productService.delete(ids);
//	}
//
//	@GetMapping("/api/Product")
//	public List<ProductEntity> getAll() {
//		return productService.getAll();
//	}
//}

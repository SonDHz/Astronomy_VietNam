package com.astronomy.API.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.astronomy.Service.IProductService;
import com.astronomy.Utils.UploadFileUtils;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;
import com.astronomy.mapper.ProductMapper;

@RestController
@RequestMapping(value = "api")
public class ProductAPI {
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private IProductService productService;
	
	@Autowired
	UploadFileUtils uploadFileUtils;


	@PostMapping(value = "Product")
	public ResponseEntity<ProductCreateModifyDTO> createProduct(HttpServletResponse response, String url, @RequestParam("img") MultipartFile file, ProductCreateModifyDTO dto, Model model) throws IOException{
		String image = uploadFileUtils.writeOrUpdate(file);
		dto.setImage(image);
		ProductEntity entity = productMapper.toProduct(dto);
		model.addAttribute("model", entity);
		ResponseEntity.ok(productMapper.toProductResponserDTO(productService.createModify(entity)));
		url = "/admin/productView";
		response.sendRedirect(url);
		return null;
	}
	
//	@PutMapping("Product")
//	public ResponseEntity<ProductCreateModifyDTO> updateProduct(@RequestBody ProductCreateModifyDTO dto, Model model){
//		ProductEntity entity = productMapper.toProduct(dto);
//		model.addAttribute("model", entity);
//		return ResponseEntity.ok(productMapper.toProductResponserDTO(productService.createModify(entity)));
//	}
	
//	@PutMapping("Product")
//	public ResponseEntity<ProductEntity> updateProduct(
//			@RequestBody ProductEntity entity, Model model){
//		ProductCreateModifyDTO dto = productMapper.toProductResponserDTO(entity);
//		model.addAttribute("model", dto);
//		return ResponseEntity.ok(productMapper.toProduct(productService.createModify(dto)));
//	}

	@DeleteMapping("Product")
	public void delete(@RequestBody long[] ids) {
		productService.delete(ids);
	}

	@GetMapping("Product")
	public List<ProductEntity> getAll() {
		return productService.getAll();
	}
}

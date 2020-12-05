package com.astronomy.API.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.astronomy.Service.IProductService;
import com.astronomy.Utils.UploadFileUtils;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.mapper.ProductMapper;

@RestController
@RequestMapping(value = "api")
public class ProductUploadAPI {

	@Autowired
	UploadFileUtils uploadFileUtils;
	
	@Autowired
	IProductService productService;
	
	@Autowired
	ProductMapper productMapper;
	
	@PostMapping(value = "Product1")
	public ResponseEntity<ProductCreateModifyDTO> uploadFile(String url, @RequestParam("img") MultipartFile file, ProductCreateModifyDTO dto, HttpServletResponse response) throws IOException {
		String image = uploadFileUtils.writeOrUpdate(file);
		dto.setImage(image);
		ResponseEntity.ok(productMapper.toProductResponserDTO(productService.createModify(productMapper.toProduct(dto))));
		url = "/admin/productView";
		response.sendRedirect(url);
		return null;
	}
}

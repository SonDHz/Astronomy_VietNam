package com.astronomy.API.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.Service.IProductService;
import com.astronomy.Utils.UploadFileUtils;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;
import com.astronomy.mapper.ProductMapper;
import com.astronomy.repository.ProductRepository;

@RestController
@RequestMapping(value = "api")
public class ProductAPI {
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private IProductService productService;
	
	@Autowired
	private UploadFileUtils uploadFileUtils;
	
	@Autowired
	private ProductRepository repo;
	
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
	
	@GetMapping(value = "Product/find/{id}")
	@ResponseBody
	public ResponseEntity<ProductEntity> find( Model model, @PathVariable("id") Long id){
		try {
			ProductEntity entity = repo.findById(id).orElse(null);
			System.out.println("entity: " + entity.getProductCategory());
			return new ResponseEntity<ProductEntity>(entity, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ProductEntity>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("Product")
	public void delete(@RequestBody long[] ids) {
		productService.delete(ids);
	}
}

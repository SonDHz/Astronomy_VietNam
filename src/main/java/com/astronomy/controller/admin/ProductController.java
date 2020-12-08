package com.astronomy.controller.admin;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.Service.IProductService;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;

@RequestMapping(value = "admin")
@Controller
public class ProductController {
	@Autowired
	private IProductService service;
	
	@Autowired
	private IProductCategoryService productCategoryService;
	
	@Autowired
	private IManufacturerService manufacturerService;
	
	@GetMapping("productView")
	public String productView(Model model) {
		List<ProductEntity> list = service.getAll();
		model.addAttribute("entity", list);
		return "admin/product_manager";
	}
	
	@GetMapping(value = "getImage")
    @ResponseBody
    public ResponseEntity<ByteArrayResource> getImage(@RequestParam("name") String photo){
		if(!photo.equals("") || photo != null){
            try{
                Path fileName = Paths.get(photo);
                byte[] buffer = Files.readAllBytes(fileName);
                ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
                return ResponseEntity.ok()
                        .contentLength(buffer.length)
                        .contentType(MediaType.parseMediaType("image/png"))
                        .body(byteArrayResource);
            }catch (Exception e){
            	e.printStackTrace();
            }
        }
        return ResponseEntity.badRequest().build();
    }

	@GetMapping("createModify/product")
	public String action(Model model,
			@RequestParam(value = "id", required = false) Long id) {
		ProductCreateModifyDTO dto = new ProductCreateModifyDTO();
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		model.addAttribute("productCategories", productCategoryService.findAll());
		model.addAttribute("manufacturers", manufacturerService.findAll());
		return "admin/action/actionProduct";
	}
	
	@GetMapping("productViewDetail")
	@ResponseBody
	public void actionview(Model model,
			@RequestParam(value = "id", required = false) Long id) {
		System.out.println("1");
		ProductCreateModifyDTO dto = new ProductCreateModifyDTO();
		model.addAttribute("modelDetail", dto);
		model.addAttribute("productCategories", productCategoryService.findAll());
		model.addAttribute("manufacturers", manufacturerService.findAll());
		System.out.println("2");
		service.findByIdDTO(id);
	}
}

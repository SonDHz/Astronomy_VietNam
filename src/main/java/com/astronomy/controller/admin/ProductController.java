package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.Service.IOrderDetailService;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.Service.IProductService;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.entity.OrderDetailEntity;
import com.astronomy.entity.ProductCategory;
import com.astronomy.entity.ProductEntity;
import com.astronomy.mapper.ProductMapper;



@RequestMapping(value = "admin")
@Controller
public class ProductController {
	@Autowired
	IProductService service;
	
	@Autowired
	IProductCategoryService servicee;

	@Autowired
	ProductMapper mapper;
	
	@Autowired
	IManufacturerService serviceee;
	
	
	@GetMapping("productView")
	public String productView(Model model) {
		List<ProductEntity> list = service.getAll();
		model.addAttribute("entity", list);
		return "admin/product_manager";
	}

	@GetMapping("createModify/product")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		ProductCreateModifyDTO dto = new ProductCreateModifyDTO();
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		return "admin/action/actionProduct";
	}
	
	@ModelAttribute("productcategory")
	public List<ProductCategory> getproductcategory(){
		List<ProductCategory> list = servicee.getAll();
		return list;
	}
	
	@ModelAttribute("manufacturer")
	public List<ManufacturerEntity> getmanufacturer(){
		List<ManufacturerEntity> list = serviceee.getAll();
		return list;
	}
}

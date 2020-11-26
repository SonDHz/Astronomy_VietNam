package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.IProductCategoryService;
import com.astronomy.dto.ProductCategoryCreateModifyDTO;
import com.astronomy.entity.ProductCategory;
import com.astronomy.mapper.ProductMapper;

@RequestMapping(value = "admin")
@Controller
public class ProductCategoryController {

	@Autowired
	IProductCategoryService service;

	@Autowired
	ProductMapper mapper;

	@GetMapping("productcategoryView")
	public String productcategoryView(Model model) {
		List<ProductCategory> list = service.getAll();
		model.addAttribute("entity", list);
		return "admin/product_category_manager";
	}

	@GetMapping("createModify/productcategory")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		ProductCategoryCreateModifyDTO dto = new ProductCategoryCreateModifyDTO();
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		return "admin/action/actionProductCategory";
	}

}

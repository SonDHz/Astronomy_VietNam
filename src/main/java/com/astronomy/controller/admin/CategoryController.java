//package com.astronomy.controller.admin;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.astronomy.Service.CategoryService;
//import com.astronomy.dto.CategoryCreateModifyDTO;
//import com.astronomy.entity.CategoryEntity;
//import com.astronomy.mapper.CategoryMapper;
//
//@RequestMapping(value = "admin")
//@Controller
//public class CategoryController {
//
//	@Autowired
//	CategoryService categoryService;
//
//	@Autowired
//	CategoryMapper categoryMapper;
//
//	@GetMapping("categoryView")
//	public String categoryView(Model model) {
//		List<CategoryEntity> list = categoryService.getAll();
//		model.addAttribute("categoryentity", list);
//		return "admin/category_manager";
//	}
//
//	@GetMapping("createModify/category")
//	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
//		CategoryCreateModifyDTO categorydto = new CategoryCreateModifyDTO();
//		if (id != null) {
//			categorydto = categoryService.findByIdDTO(id);
//		}
//		model.addAttribute("model", categorydto);
//		return "admin/action/actionCategory";
//	}
//}

package com.astronomy.controller.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.astronomy.Service.IProductService;
import com.astronomy.entity.ProductEntity;


@RequestMapping(value = "user")
@Controller
public class ProductViewController {
	@Autowired
	private IProductService service;
	
	@GetMapping("shoppingTools")
	public String productViews(Model model) {
		return findPaginated(1, model);
	}
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
		LocalDate ht = LocalDate.now();
		model.addAttribute("ht", ht);
		Page<ProductEntity> page = service.getAll(pageNo, 2);
		List<ProductEntity> list = page.getContent();
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("entityView", list);
		return "web/shopping_tools";
	}
}

package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.CategoryService;
import com.astronomy.Service.IPostService;
import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;

@RequestMapping(value = "admin")
@Controller
public class PostController {
	
	@Autowired
	private IPostService service;
	
	@Autowired
	private CategoryService categoryService;
		
	@GetMapping("postView")
	public String postView(Model model) {
		List<PostEntity> list = service.getAll();
		model.addAttribute("entity", list);
		return "admin/post_manager";
	}

	@GetMapping("createModify/post")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		PostCreateModifyDTO dto = new PostCreateModifyDTO();
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		model.addAttribute("category", categoryService.findAll()); //cái category ở đây để làm gì v m
		return "admin/action/actionPost";
	}
}

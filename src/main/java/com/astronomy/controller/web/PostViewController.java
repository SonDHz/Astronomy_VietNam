package com.astronomy.controller.web;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.*;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.astronomy.Service.CategoryService;
import com.astronomy.Service.IPostService;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;
import com.astronomy.entity.ProductCategoryEntity;

import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Controller
public class PostViewController {

	@Autowired
	private IPostService service;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private IProductCategoryService productCategoryService;
	
	@GetMapping("/")
	public String productView(Model model) {
		List<ProductCategoryEntity> pro = productCategoryService.getAll();
		model.addAttribute("productCategorySession", pro);
		return findPaginated(1, model);
	}
	
	@GetMapping("/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
		List<ProductCategoryEntity> pro = productCategoryService.getAll();
		model.addAttribute("productCategorySession", pro);
		List<PostEntity> POST = service.getAllIdDesc();
		model.addAttribute("entity", POST);
		List<PostEntity> post = service.getAllRamdom();
		model.addAttribute("entityramdom", post);
		LocalDate ht = LocalDate.now();
		model.addAttribute("ht", ht);
		Page<PostEntity> page = service.getPostPaging(pageNo, 12);
		List<PostEntity> list = page.getContent();
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());	
		model.addAttribute("postView", list);	
		return "web/index";
	}
	
	@GetMapping("/postViewDetail")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		PostCreateModifyDTO dto = new PostCreateModifyDTO();
		
		List<ProductCategoryEntity> pro = productCategoryService.getAll();
		model.addAttribute("productCategorySession", pro);
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		model.addAttribute("category", categoryService.findAll()); 
		return "web/PostView";
	}

	@GetMapping(value = "getImageViewPost")
	@ResponseBody
	public ResponseEntity<ByteArrayResource> getImage(@RequestParam("img") String photo) {
		if (!photo.equals("") || photo != null) {
			try {
				Path fileName = Paths.get(photo);
				byte[] buffer = Files.readAllBytes(fileName);
				ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
				return ResponseEntity.ok().contentLength(buffer.length)
						.contentType(MediaType.parseMediaType("image/png")).body(byteArrayResource);
			} catch (Exception e) {
				System.out.println("catch");
				e.printStackTrace();
			}
		}
		return ResponseEntity.badRequest().build();
	}
}

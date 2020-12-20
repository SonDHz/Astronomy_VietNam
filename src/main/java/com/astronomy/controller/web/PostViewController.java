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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.astronomy.Service.CategoryService;
import com.astronomy.Service.IPostService;
import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;
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
	
	@GetMapping("PostView")
	public String productViews(Model model) {
		return findPaginated(1, model);
	}

	@GetMapping("/PostView/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
		LocalDate ht = LocalDate.now();
		model.addAttribute("ht", ht);
		Page<PostEntity> page = service.getPostPaging(pageNo, 6);
		List<PostEntity> list = page.getContent();
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());	
		model.addAttribute("postView", list);	
		return "web/postView";
	}
	
	@GetMapping("/postViewDetail/{id}")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		PostCreateModifyDTO dto = new PostCreateModifyDTO();
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		model.addAttribute("category", categoryService.findAll()); 
		return "web/postViewDetail";
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

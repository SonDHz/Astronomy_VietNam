package com.astronomy.controller.web;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.astronomy.Service.IProductService;
import com.astronomy.entity.ProductEntity;

@Controller
public class ProductViewController {
	@Autowired
	private IProductService service;

	@GetMapping("shoppingTools")
	public String productViews(Model model) {
		System.out.println("1");
		return findPaginated(1, model);
	}

	@GetMapping(value = "getImageView")
	@ResponseBody
	public ResponseEntity<ByteArrayResource> getImage(@RequestParam("img") String photo) {
		System.out.println("2");
		if (!photo.equals("") || photo != null) {
			try {
				Path fileName = Paths.get(photo);
				byte[] buffer = Files.readAllBytes(fileName);
				ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
				return ResponseEntity.ok().contentLength(buffer.length)
						.contentType(MediaType.parseMediaType("image/png")).body(byteArrayResource);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ResponseEntity.badRequest().build();
	}

	@GetMapping("/shoppingTools/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
		System.out.println("3");
		LocalDate ht = LocalDate.now();
		System.out.println("1.1");
		model.addAttribute("ht", ht);
		System.out.println("1.2");
		Page<ProductEntity> page = service.getAll(pageNo, 6);
		System.out.println("1.3");
		List<ProductEntity> list = page.getContent();
		System.out.println("1.4");
		model.addAttribute("currentPage", pageNo);
		System.out.println("1.5");
		model.addAttribute("totalPages", page.getTotalPages());
		System.out.println("1.6");
		model.addAttribute("totalItems", page.getTotalElements());
		System.out.println("1.7");
		model.addAttribute("entityView", list);
		System.out.println("1.8");
		return "web/shopping_tools";
	}

}

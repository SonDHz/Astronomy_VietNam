package com.astronomy.controller.admin;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.astronomy.Service.IOrderService;
import com.astronomy.Service.IPostService;
import com.astronomy.Service.IProductService;
import com.astronomy.Service.IUserService;
import com.astronomy.entity.PostEntity;


@Controller(value = "HomeControllerOfAdmin")
@RequestMapping(value = "/admin")
public class HomeController {
	@Autowired
	IProductService product;
	
	@Autowired
	private IPostService service;
	
	@Autowired
	private IOrderService order;
	
	@Autowired
	private IUserService user;
	
	@Autowired
	private IPostService post;

	
	@RequestMapping("dashboard")
	public String index(Model model, @RequestParam(value = "number", required = false) Long number) {
		model.addAttribute("product", product.count());
		model.addAttribute("order", order.countOrder());
		model.addAttribute("accout", user.countUser());
		model.addAttribute("post", post.countPost());
		List<PostEntity> list = service.getAllIdDescLimit();
		model.addAttribute("entity", list);
		return "admin/dashboard";
	}
	
	@GetMapping("admin/dashboard")
	public String postdashboard(Model model) {
		Map<String, Integer> surveymap = new LinkedHashMap<>();
		surveymap.put("java", 50);
		surveymap.put("Go Lang", 20);
		surveymap.put("C#", 15);
		surveymap.put("React JS", 10);
		surveymap.put("C++", 5);
		model.addAttribute("surveymap", surveymap);
		return "admin/dashboard";
	}
	
	@GetMapping(value = "getImageViewPostDashboard")
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
	

	@RequestMapping("Edit")
	public String e() {
		return "admin/Post_Edit";
	}
}
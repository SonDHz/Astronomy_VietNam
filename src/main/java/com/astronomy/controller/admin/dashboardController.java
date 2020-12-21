package com.astronomy.controller.admin;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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

import com.astronomy.Service.IPostService;
import com.astronomy.entity.PostEntity;
import com.astronomy.entity.ProductCategoryEntity;


@Controller
public class dashboardController {
	@Autowired
	private IPostService service;
	
	@GetMapping("admin/dashboard")
	public String postdashboard(Model model) {
		List<PostEntity> list = service.getAllIdDescLimit();
		model.addAttribute("entity", list);
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
}

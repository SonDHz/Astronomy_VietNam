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


@RequestMapping(value = "user")
@Controller
public class ProductViewController {
	@Autowired
	private IProductService service;
	
	@GetMapping("shoppingTools")
	public String productViews(Model model) {
		return findPaginated(1, model);
	}
	
	@GetMapping(value = "getImageView")
    @ResponseBody
    public ResponseEntity<ByteArrayResource> getImage(@RequestParam("img") String photo){
		if(!photo.equals("") || photo != null){
            try{
                Path fileName = Paths.get(photo);
                byte[] buffer = Files.readAllBytes(fileName);
                ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
                return ResponseEntity.ok()
                        .contentLength(buffer.length)
                        .contentType(MediaType.parseMediaType("image/png"))
                        .body(byteArrayResource);
            }catch (Exception e){
            	e.printStackTrace();
            }
        }
        return ResponseEntity.badRequest().build();
    }
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
		LocalDate ht = LocalDate.now();
		model.addAttribute("ht", ht);
		Page<ProductEntity> page = service.getAll(pageNo, 6);
		List<ProductEntity> list = page.getContent();
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("entityView", list);
		return "web/shopping_tools";
	}
	
	
}

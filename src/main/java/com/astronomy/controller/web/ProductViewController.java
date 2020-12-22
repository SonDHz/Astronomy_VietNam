package com.astronomy.controller.web;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.astronomy.Service.IManufacturerService;
import com.astronomy.Service.IPagingService;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.Service.IProductService;
import com.astronomy.dto.PagingDTO;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductCategoryEntity;
import com.astronomy.entity.ProductEntity;

@Controller
public class ProductViewController {
	@Autowired
	private IProductService service;

	@Autowired
	private IProductCategoryService productCategoryService;

	@Autowired
	private IManufacturerService manufacturerService;
	
//	@Autowired
//	private IPagingService pagingService ;
	
	@GetMapping("/shoppingTools/{id}")
	public String productViews(Model model, @PathVariable(value = "id") long id) {
		List<ProductCategoryEntity> pro = productCategoryService.getAll();
		model.addAttribute("productCategorySession", pro);
		List<ProductEntity> entity =  service.getProductByCategory(id);
		model.addAttribute("entityView", entity);
		return "web/shopping_tools";
	}
		
// Phân trang cũ 
//	@GetMapping("shoppingTools/{id}")
//	public String productViews(Model model, @PathVariable(value = "id") long id) {
//		List<ProductCategoryEntity> pro = productCategoryService.getAll();
//		model.addAttribute("productCategorySession", pro);
//		return findPaginated(1, model, id);
//	}
//
//	@GetMapping("/shoppingTools/{id}/{pageNo}")
//	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model, @PathVariable long id) {
//		List<ProductCategoryEntity> pro = productCategoryService.getAll();
//		model.addAttribute("productCategorySession", pro);
//		LocalDate ht = LocalDate.now();
//		model.addAttribute("ht", ht);
//		Page<ProductEntity> page = service.getProductPaging(pageNo, 6);
//		System.out.println("page: " + page);
////		List<ProductEntity> list = page.getContent();
//		List<ProductEntity> entity =  service.getProductByCategory(id);
//		entity = page.getContent();
//		model.addAttribute("currentPage", pageNo);
//		model.addAttribute("totalPages", page.getTotalPages());
//		model.addAttribute("totalItems", page.getTotalElements());
//		
////		model.addAttribute("entityView", list);
//		model.addAttribute("productByCategory", entity);	
//		return "web/shopping_tools";
//	}

	@GetMapping("/productViewDetail/{id}")
	public String action(Model model, @PathVariable(value = "id", required = false) Long id) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		ProductCreateModifyDTO dto = new ProductCreateModifyDTO();
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		model.addAttribute("productCategories", productCategoryService.findAll());
		model.addAttribute("manufacturers", manufacturerService.findAll());
		return "web/productViews";
	}

	@RequestMapping("/shoppingToolsSearch")
	public String productSearch(Model model, @RequestParam(value = "keyword") String keyword) {
		List<ProductCategoryEntity> pro = productCategoryService.getAll();
		model.addAttribute("productCategorySession", pro);
		List<ProductEntity> entity =  service.getProductSearch(keyword);
		System.out.println("entity search: " + entity);
		model.addAttribute("entityView", entity);
		return "web/shopping_tools";
	}
	
	@GetMapping(value = "getImageView")
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

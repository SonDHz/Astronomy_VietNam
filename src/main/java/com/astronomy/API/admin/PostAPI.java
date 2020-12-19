package com.astronomy.API.admin;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.astronomy.Service.IPostService;
import com.astronomy.Utils.UploadFileUtils;
import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;
import com.astronomy.mapper.PostMapper;

@RestController
@RequestMapping(value = "api")
public class PostAPI {

	@Autowired
	private PostMapper postMapper;

	@Autowired
	private IPostService postService;

	@Autowired
	private UploadFileUtils uploadFileUtils;

	@GetMapping("Post")
	public List<PostEntity> getAll() {
		return postService.getAll();
	}

//	@PostMapping(value = "Product")
//	public ResponseEntity<ProductCreateModifyDTO> createProduct(HttpServletResponse response, String url, @RequestParam("img") MultipartFile file, ProductCreateModifyDTO dto, Model model) throws IOException{
//		String image = uploadFileUtils.writeOrUpdate(file);
//		dto.setImage(image);
//		ProductEntity entity = productMapper.toProduct(dto);
//		model.addAttribute("model", entity);
//		ResponseEntity.ok(productMapper.toProductResponserDTO(productService.createModify(entity)));
//		url = "/admin/productView";
//		response.sendRedirect(url);
//		return null;
//	}

	@PostMapping(value = "Post")
	public ResponseEntity<PostCreateModifyDTO> createPost(PostCreateModifyDTO dto, Model model,
			HttpServletResponse response, String url, @RequestParam("img") MultipartFile file) throws Exception {
		String image = uploadFileUtils.writeOrUpdate(file);
		dto.setThumbnail(image);
		PostEntity entity = postMapper.toPost(dto);
		model.addAttribute("model", entity);
		ResponseEntity.ok(postMapper.toPostCreateModifyDTO(postService.createModify(entity)));
		url = "/admin/postView";
		response.sendRedirect(url);
		return null;
	}

	@PutMapping(value = "Post", consumes = { "multipart/form-data" })
	public ResponseEntity<PostCreateModifyDTO> updatePost(@RequestBody PostCreateModifyDTO dto, Model model) {
		PostEntity entity = postMapper.toPost(dto);
		model.addAttribute("model", entity);
		return ResponseEntity.ok(postMapper.toPostCreateModifyDTO(postService.createModify(entity)));
	}

	@DeleteMapping(value = "Post")
	public void deletepost(@RequestBody long[] ids) {
		postService.delete(ids);
	}

}

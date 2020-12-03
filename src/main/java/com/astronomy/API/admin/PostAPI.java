package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.IPostService;
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

	@GetMapping("Post")
	public List<PostEntity> getAll() {
		return postService.getAll();
	}

	@PostMapping("Post")
	public ResponseEntity<PostCreateModifyDTO> createPost(
			@RequestBody PostCreateModifyDTO dto, Model model) {
		PostEntity entity = postMapper.toPost(dto);
		model.addAttribute("model", entity);
		return ResponseEntity.ok(postMapper.toPostCreateModifyDTO(postService.createModify(entity)));
	}

	@PutMapping("Post")
	public ResponseEntity<PostCreateModifyDTO> updatePost(
			@RequestBody PostCreateModifyDTO dto, Model model) {
		PostEntity entity = postMapper.toPost(dto);
		model.addAttribute("model", entity);
		return ResponseEntity.ok(postMapper.toPostCreateModifyDTO(postService.createModify(entity)));
	}

	@DeleteMapping(value = "Post")
	public void deletepost(@RequestBody long[] ids) {
		postService.delete(ids);
	}

}

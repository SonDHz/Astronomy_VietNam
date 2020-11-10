package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.PostService;
import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;
import com.astronomy.mapper.PostMapper;

@RestController
public class PostAPI {

	@Autowired
	private PostMapper postMapper;

	@Autowired
	private PostService postService;																							

	@GetMapping("api/post")
	public List<PostEntity> getAll() {
		return postService.getAll();
	}

	@PostMapping("api/post")
	public ResponseEntity<PostCreateModifyDTO> createPost(@RequestBody PostCreateModifyDTO dto) {
		PostEntity post = postMapper.toPost(dto);
		return ResponseEntity.ok(postMapper.toPostCreateModifyDTO(postService.create(post)));
	}

	@PutMapping("api/post/{id}")
	public ResponseEntity<PostCreateModifyDTO> updatePost(@RequestBody PostCreateModifyDTO dto,
			@PathVariable("id") long id) {
		dto.setId(id);
		PostEntity post = postMapper.toPost(dto);
		return ResponseEntity.ok(postMapper.toPostCreateModifyDTO(postService.create(post)));
	}
	
	@DeleteMapping(value ="api/post")
	public void deletepost(@RequestBody long[] ids) {
		postService.delete(ids);
	}

}

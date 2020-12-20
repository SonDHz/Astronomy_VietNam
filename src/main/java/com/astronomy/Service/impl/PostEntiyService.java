package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IPostService;
import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;
import com.astronomy.entity.ProductEntity;
import com.astronomy.mapper.PostMapper;
import com.astronomy.repository.PostRepository;


@Service
public class PostEntiyService implements IPostService{

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private PostMapper postMapper;

	@Override
	public List<PostEntity> getAll() {
		return postRepository.findAll();
	}
	
	@Override
	public PostEntity createModify(PostEntity postEntity) {
		return postRepository.save(postEntity);
	}
	
	@Override
	public void delete(long[] ids) {
		for(long item: ids) {
			postRepository.deleteById(item);
		}
	}

	@Override
	public PostCreateModifyDTO findByIdDTO(long id) {
		PostEntity post = postRepository.findById(id).orElse(null);
		return postMapper.toPostCreateModifyDTO(post);
	}

	@Override
	public Page<PostEntity> getPostPaging(int pageNo, int pageSize) {
		return postRepository.findAll(PageRequest.of(pageNo -1, pageSize));
	}
}

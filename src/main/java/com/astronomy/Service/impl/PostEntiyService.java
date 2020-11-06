package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.PostService;
import com.astronomy.entity.PostEntity;
import com.astronomy.repository.PostRepository;

@Service
public class PostEntiyService implements PostService{

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public PostEntity create(PostEntity postEntity) {	
		return postRepository.save(postEntity);
	}

	@Override
	public List<PostEntity> getAll() {
		return postRepository.getAll();
	}

	@Override
	public void delete(long[] ids) {
		for(long item: ids) {
			postRepository.deleteById(item);
		}
	}
}

package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IPostService;
import com.astronomy.entity.PostEntity;
import com.astronomy.repository.PostRepository;

@Service
public class PostEntiyService implements IPostService{

	@Autowired
	private PostRepository postRepository;

	@Override
	public List<PostEntity> getAll() {
		return postRepository.getAll();
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
}

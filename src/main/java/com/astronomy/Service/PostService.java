package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.PostEntity;

public interface PostService {

	PostEntity create(PostEntity postEntity);
	
	void delete(long[] ids);
	
	List<PostEntity> getAll();

}

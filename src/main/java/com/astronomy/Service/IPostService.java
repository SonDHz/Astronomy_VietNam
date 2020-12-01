package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.PostEntity;

public interface IPostService {
	
	List<PostEntity> getAll();
	
	PostEntity createModify(PostEntity postEntity);
	
	void delete(long[] ids);
	
}

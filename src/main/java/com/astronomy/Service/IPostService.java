package com.astronomy.Service;

import java.util.List;

import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;

public interface IPostService {
	
	List<PostEntity> getAll();
	
	PostEntity createModify(PostEntity postEntity);
	
	PostCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
}

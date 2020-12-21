package com.astronomy.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.PostEntity;

public interface IPostService {
	
	List<PostEntity> getAll();
	
	PostEntity createModify(PostEntity postEntity);
	
	PostCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
	Page<PostEntity> getPostPaging( int pageNo, int pageSize);
	
	public List<PostEntity> getAllIdDesc();
	
	public List<PostEntity> getAllRamdom();
	
	public List<PostEntity> getAllIdDescLimit();
	
}

package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.RoleEntity;

public interface IRoleService {
	
	List<RoleEntity> getAllRole();

	RoleEntity createModify(RoleEntity roleEntity);
	
	String delete(Long id);
}

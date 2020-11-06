package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.RoleEntity;

public interface IRoleService {
	
	List<RoleEntity> getAllRole();

	RoleEntity create(RoleEntity roleEntity);

	RoleEntity Update(RoleEntity roleEntity);
	
	String delete(Long id);
}

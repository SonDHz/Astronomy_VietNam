package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IRoleService;
import com.astronomy.entity.RoleEntity;
import com.astronomy.repository.RoleRepository;

@Service
public class RoleEntityService implements IRoleService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<RoleEntity> getAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public RoleEntity createModify(RoleEntity roleEntity) {
		return roleRepository.save(roleEntity);
	}

	@Override
	public String delete(Long id) {
		roleRepository.deleteById(id);
		return "Successful";
	}


}

package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astronomy.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>{
	
}

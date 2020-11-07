package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astronomy.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
}

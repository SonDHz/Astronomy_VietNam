package com.astronomy.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IUserService;
import com.astronomy.entity.UserEntity;
import com.astronomy.repository.UserRepository;

@Service
public class UserEntityService implements IUserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserEntity create(UserEntity userEntity) {
		return userRepository.save(userEntity); // 1. id == null create / 2. update 
	}
}

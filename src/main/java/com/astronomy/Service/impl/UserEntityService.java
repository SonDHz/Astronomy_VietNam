package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IUserService;
import com.astronomy.entity.UserEntity;
import com.astronomy.repository.UserRepository;

@Service
public class UserEntityService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserEntity> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity create(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity Update(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	public String delete(Long id) {
		userRepository.deleteById(id);
		return "Successful";
	}
}

package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IUserService;
import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;
import com.astronomy.mapper.UserMapper;
import com.astronomy.repository.UserRepository;

@Service
public class UserEntityService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserEntity> getAll() {
		return userRepository.findAll();
	}
	
	@Override
	public UserEntity createModify(UserEntity entity) {
		return userRepository.save(entity);		 
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			userRepository.deleteById(id);
		}
	}

	@Override
	public UserCreateModifyDTO findByIdDTO(long id) {
		UserEntity userentity = userRepository.findById(id).orElse(null);
		return userMapper.toUserResponserDTO(userentity);
	}

//	@Override
//	public List<UserEntity> getAllUser() {
//		return userRepository.getAllUser();
//	}
	
	@Override
	public List<UserEntity> getAllCustomer() {
		return userRepository.getAllCustomer();
	}
	
}

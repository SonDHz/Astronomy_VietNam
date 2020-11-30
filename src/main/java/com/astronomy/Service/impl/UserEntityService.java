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
	public UserCreateModifyDTO createModify(UserCreateModifyDTO userdto) {
		UserEntity userentity = new UserEntity();
		userentity = userMapper.toUser(userdto);
		userentity = userRepository.save(userentity);
		return userdto;
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
	
}

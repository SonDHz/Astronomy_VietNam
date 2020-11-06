package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.UserEntity;

public interface IUserService {

	List<UserEntity> getAllUser();

	UserEntity create(UserEntity userEntity);

	UserEntity Update(UserEntity userEntity);
	
	String delete(Long id);
}

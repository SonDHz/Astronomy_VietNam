package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.UserEntity;

public interface IUserService {

	List<UserEntity> getAllUser();

	UserEntity createModify(UserEntity userEntity);
	
	String delete(Long id);
	
}

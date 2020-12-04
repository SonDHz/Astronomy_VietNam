package com.astronomy.Service;

import java.util.List;

import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;

public interface IUserService {

	List <UserEntity> getAll();
	
	UserEntity createModify(UserEntity entity);
	
	UserCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);

	List<UserEntity> getAllUser();

	List<UserEntity> getAllCustomer();
}

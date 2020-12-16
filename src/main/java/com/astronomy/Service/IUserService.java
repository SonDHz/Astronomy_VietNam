package com.astronomy.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;

public interface IUserService {
	
	List <UserEntity> getAll();
	
	UserEntity createModify(UserEntity entity);
	
	UserEntity registration(UserCreateModifyDTO dto);
	
	UserCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);

	List<UserEntity> getAllCustomer();
}

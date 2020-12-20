package com.astronomy.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;

public interface IUserService {
	
	/**
	 * 
	 * @return
	 */
	List <UserEntity> getAll();
	
	/**
	 * day la phuong thuc de tao or xoa user
	 * @param entity Doi tuong User
	 * @return Doi duong user duoc tao or update
	 */
	UserEntity createModify(UserEntity entity);
	
	UserEntity registration(UserCreateModifyDTO dto);
	
	UserCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);

	List<UserEntity> getAllCustomer();
}

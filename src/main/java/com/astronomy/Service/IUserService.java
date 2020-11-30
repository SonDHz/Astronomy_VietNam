package com.astronomy.Service;

import java.util.List;

import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;

public interface IUserService {

	List <UserEntity> getAll();
	
	UserCreateModifyDTO createModify(UserCreateModifyDTO userdto);
	
	UserCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
}

package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;

//conver to entity or dto
@Component
public class UserMapper {
	
	public UserEntity toUser(UserCreateModifyDTO dto) {
		return UserEntity.builder()
				.id(dto.getId())
				.username(dto.getUsername())
				.password(dto.getPassword())
				.fullName(dto.getFullName())
				.email(dto.getEmail())
				.phoneNumber(dto.getPhoneNumber())
				.address(dto.getAddress())
				.gender(dto.getGender())
				.birthday(dto.getBirthday())
				.avatar(dto.getAvatar())
				.status(dto.getStatus())
				.createBy(dto.getCreateBy())
				.modifyBy(dto.getModifyBy())
				.build();
	}
	
	public UserCreateModifyDTO toUserResponserDTO(UserEntity user) {
		return UserCreateModifyDTO.builder()
				.id(user.getId() != null ? user.getId() : null)
				.username(user.getUsername())
				.password(user.getPassword())
				.fullName(user.getFullName())
				.email(user.getEmail())
				.phoneNumber(user.getPhoneNumber())
				.address(user.getAddress())
				.gender(user.getGender())
				.birthday(user.getBirthday())
				.avatar(user.getAvatar())
				.status(user.getStatus())
				.createBy(user.getCreateBy())
				.modifyBy(user.getModifyBy())
				.build();
	}
}

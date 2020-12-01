package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;

@Component
public class UserMapper {
	
	public UserEntity toUser(UserCreateModifyDTO dto) {
		return UserEntity.builder()//
				.id(dto.getId())//
				.username(dto.getUsername())//
				.password(dto.getPassword())//
				.fullName(dto.getFullName())//
				.email(dto.getEmail())//
				.phoneNumber(dto.getPhoneNumber())//
				.address(dto.getAddress())//
				.gender(dto.getGender())//
				.birthday(dto.getBirthday())//
				.avatar(dto.getAvatar())//
				.status(dto.getStatus())//
				.createdBy(dto.getCreatedBy())//
				.createdDate(dto.getCreatedDate())//
				.modifiedBy(dto.getModifiedBy())//
				.modifiedDate(dto.getModifiedDate())//
				.build();//
	}
	
	public UserCreateModifyDTO toUserResponserDTO(UserEntity user) {
		return UserCreateModifyDTO.builder()
				.id(user.getId())//
				.username(user.getUsername())//
				.password(user.getPassword())//
				.fullName(user.getFullName())//
				.email(user.getEmail())//
				.phoneNumber(user.getPhoneNumber())//
				.address(user.getAddress())//
				.gender(user.getGender())//
				.birthday(user.getBirthday())//
				.avatar(user.getAvatar())//
				.status(user.getStatus())//
				.createdBy(user.getCreatedBy())//
				.createdDate(user.getCreatedDate())//
				.modifiedBy(user.getModifiedBy())//
				.modifiedDate(user.getModifiedDate())//
				.build();//
	}
}

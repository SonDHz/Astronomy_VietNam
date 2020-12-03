package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.RoleCreateModifyDTO;
import com.astronomy.entity.RoleEntity;

@Component
public class RoleMapper {

	public RoleEntity toRole(RoleCreateModifyDTO dto) {
		return RoleEntity.builder()//
				.id(dto.getId())//
				.roleName(dto.getRoleName())//
				.code(dto.getCode())//
				.createdBy(dto.getCreatedBy())//
				.createdDate(dto.getCreatedDate())//
				.modifiedBy(dto.getModifiedBy())//
				.modifiedDate(dto.getModifiedDate())//
				.build();
	}

	public RoleCreateModifyDTO toRoleResponserDTO(RoleEntity role) {
		return RoleCreateModifyDTO.builder()//
				.id(role.getId())//
				.roleName(role.getRoleName())//
				.code(role.getCode())//
				.createdBy(role.getCreatedBy())//
				.createdDate(role.getCreatedDate())//
				.modifiedBy(role.getModifiedBy())//
				.modifiedDate(role.getModifiedDate())//
				.build();
	}
}

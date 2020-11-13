package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.RoleCreateModifyDTO;
import com.astronomy.entity.RoleEntity;

@Component
public class RoleMapper {
	
	public RoleEntity toRole(RoleCreateModifyDTO dto) {
		return RoleEntity.builder()
				.id(dto.getId())
				.roleName(dto.getRoleName())
				.code(dto.getCode())
				.createBy(dto.getCreateBy())
				.modifyBy(dto.getModifyBy())
				.build();
	}
	
	public RoleCreateModifyDTO toRoleResponserDTO(RoleEntity role) {
		return RoleCreateModifyDTO.builder()
				.id(role.getId())
				.roleName(role.getRoleName())
				.code(role.getCode())
				.createBy(role.getCreateBy())
				.modifyBy(role.getModifyBy())
				.build();
	}
}

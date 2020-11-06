package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.IRoleService;
import com.astronomy.Service.IUserService;
import com.astronomy.dto.RoleCreateModifyDTO;
import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.RoleEntity;
import com.astronomy.entity.UserEntity;
import com.astronomy.mapper.RoleMapper;
import com.astronomy.mapper.UserMapper;

@RestController
public class RoleAPI { 
	 
	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	private IRoleService roleService;
	 
	@GetMapping(value = "/api/Role")
	public List<RoleEntity> getAllRole(){
		return roleService.getAllRole();
	}
	
	@PostMapping(value = "/api/Role")
	public ResponseEntity<RoleCreateModifyDTO> createUser(@RequestBody RoleCreateModifyDTO dto){
		RoleEntity role = roleMapper.toRole(dto);
		return ResponseEntity.ok(roleMapper.toRoleResponserDTO(roleService.create(role)));
	}
	
	@PutMapping(value = "/api/Role/{id}")
	public ResponseEntity<RoleCreateModifyDTO> updateUser(@RequestBody RoleCreateModifyDTO dto, @PathVariable long id){
		dto.setId(id);
		RoleEntity role = roleMapper.toRole(dto);
		return ResponseEntity.ok(roleMapper.toRoleResponserDTO(roleService.Update(role)));
	}
	
	@DeleteMapping("/api/Role/{id}")
	public String deleteRole(@PathVariable("id") long ids) {
		return roleService.delete(ids);
	}
}

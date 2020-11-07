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

import com.astronomy.Service.IUserService;
import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;
import com.astronomy.mapper.UserMapper;

@RestController
public class UserAPI {
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private IUserService userService;
	 
	@GetMapping(value = "/api/User")
	public List<UserEntity> getAllUser(){
		return userService.getAllUser();
	}
	
	@PostMapping(value = "/api/User")
	public ResponseEntity<UserCreateModifyDTO> createUser(@RequestBody UserCreateModifyDTO dto){
		UserEntity user = userMapper.toUser(dto);
		return ResponseEntity.ok(userMapper.toUserResponserDTO(userService.create(user)));
	}
	
	@PutMapping(value = "/api/User/{id}")
	public ResponseEntity<UserCreateModifyDTO> updateUser(@RequestBody UserCreateModifyDTO dto, @PathVariable long id){
		dto.setId(id);
		UserEntity user = userMapper.toUser(dto);
		return ResponseEntity.ok(userMapper.toUserResponserDTO(userService.Update(user)));
	}
	
	@DeleteMapping("/api/User/{id}")
	public String deleteUser(@PathVariable("id") long ids) {
		return userService.delete(ids);
	}
}

package com.astronomy.API.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping("/api/User")
	public ResponseEntity<UserCreateModifyDTO> createUser(@RequestBody UserCreateModifyDTO dto){
		UserEntity user = userMapper.toUser(dto);
		return ResponseEntity.ok(userMapper.toUserResponserDTO(userService.create(user)));
	}
}

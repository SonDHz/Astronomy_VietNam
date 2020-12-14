package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.IUserService;
import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;
import com.astronomy.mapper.UserMapper;
import com.astronomy.repository.UserRepository;

@RestController
@RequestMapping(value = "api")
public class UserAPI {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private IUserService userService;
	
	@Autowired
	UserRepository userRepository;

	@PostMapping("User")
	public ResponseEntity<UserCreateModifyDTO> createUser(
			@RequestBody UserCreateModifyDTO dto, Model model){
		UserEntity entity = userMapper.toUser(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(userMapper.toUserResponserDTO(userService.createModify(entity)));
	}
	
	@PutMapping("User")
	public ResponseEntity<UserCreateModifyDTO> updateUser(
			@RequestBody UserCreateModifyDTO dto, Model model){
		UserEntity entity = userMapper.toUser(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(userMapper.toUserResponserDTO(userService.createModify(entity)));
	}

	@DeleteMapping("User")
	public void delete(@RequestBody long[] ids) {
		userService.delete(ids);
	}
	
}

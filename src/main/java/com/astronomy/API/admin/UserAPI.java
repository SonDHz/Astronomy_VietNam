//package com.astronomy.API.admin;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.astronomy.Service.IUserService;
//import com.astronomy.dto.UserCreateModifyDTO;
//import com.astronomy.entity.RoleEntity;
//import com.astronomy.entity.UserEntity;
//import com.astronomy.mapper.UserMapper;
//
//@RestController
//@RequestMapping(value = "api")
//public class UserAPI {
//	@Autowired
//	private UserMapper userMapper;
//
//	@Autowired
//	private IUserService userService;
//
//	@PostMapping("User")
//	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userentity, Model model){
//		UserCreateModifyDTO userdto = userMapper.toUserResponserDTO(userentity);
//		model.addAttribute("model", userdto);
//		return ResponseEntity.ok(userMapper.toUser(userService.createModify(userdto)));
//	}
//	
//	@PutMapping("User")
//	public ResponseEntity<UserEntity> updateCategory(@RequestBody UserEntity userentity, Model model){
//		UserCreateModifyDTO userdto = userMapper.toUserResponserDTO(userentity);
//		model.addAttribute("model", userdto);
//		return ResponseEntity.ok(userMapper.toUser(userService.createModify(userdto)));
//	}
//
//	@DeleteMapping("User")
//	public void delete(@RequestBody long[] ids) {
//		userService.delete(ids);
//	}
//
//	@GetMapping("User")
//	public List<UserEntity> getAll() {
//		return userService.getAll();
//	}
//}

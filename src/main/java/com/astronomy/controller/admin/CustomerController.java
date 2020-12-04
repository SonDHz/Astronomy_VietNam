package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.IUserService;
import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.UserEntity;
import com.astronomy.mapper.UserMapper;
import com.astronomy.repository.UserRepository;

@RequestMapping(value = "admin")
@Controller
public class CustomerController {

	@Autowired
	IUserService userService;
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	UserMapper userMapper;

	@GetMapping("customerView")
	public String UserView(Model model) {
		List<UserEntity> list = userService.getAllCustomer();
		model.addAttribute("userentity", list);
		return "admin/customer_manager";
	}

	@GetMapping("createModify/customer")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		UserCreateModifyDTO userdto = new UserCreateModifyDTO();
		if (id != null) {
			userdto = userService.findByIdDTO(id);
		}
		model.addAttribute("model", userdto);
		return "admin/action/actionCustomer";
	}
}

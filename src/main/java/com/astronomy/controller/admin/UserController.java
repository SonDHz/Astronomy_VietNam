package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.Service.IUserService;
import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.dto.UserCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.entity.UserEntity;
import com.astronomy.mapper.ManufacturerMapper;
import com.astronomy.mapper.UserMapper;

@RequestMapping(value = "admin")
@Controller
public class UserController {
	
	@Autowired
	IUserService userService;

	@Autowired
	UserMapper userMapper;

	@GetMapping("userView")
	public String UserView(Model model) {
		List<UserEntity> list = userService.getAll();
		model.addAttribute("userentity", list);
		return "admin/employee_manager";
	}

	@GetMapping("createModify/user")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		UserCreateModifyDTO userdto = new UserCreateModifyDTO();
		
		if (id != null) {
			userdto = userService.findByIdDTO(id);
		}
		model.addAttribute("model", userdto);
		return "admin/action/actionEmployee";
	}
}

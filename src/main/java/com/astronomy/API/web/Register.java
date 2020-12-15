package com.astronomy.API.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.IUserService;
import com.astronomy.dto.UserCreateModifyDTO;

@RestController
@RequestMapping(value = "api")
public class Register {
	
private IUserService service;
	
	@PostMapping(value = "/registration")
	public String registrationController(@RequestBody UserCreateModifyDTO dto, Model model) {
		model.addAttribute("userDTO", dto);
		service.registration(dto);
		return "redirect:/registration?success";
	}
}

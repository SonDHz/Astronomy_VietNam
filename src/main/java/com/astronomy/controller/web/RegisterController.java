package com.astronomy.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.astronomy.Service.IUserService;
import com.astronomy.dto.UserCreateModifyDTO;

@Controller
@RequestMapping(value = "/registration")
public class RegisterController {
	
	private IUserService service;
	
	@GetMapping
	public String register(Model model) {
		UserCreateModifyDTO dto = new UserCreateModifyDTO();
		model.addAttribute("userDTO", dto);
		return "register";
	}
	
	@PostMapping
	public String registrationController(@ModelAttribute("userDTO") UserCreateModifyDTO dto) {
		System.out.println("dto" + dto);
		service.registration(dto);
		return "redirect:/registration?success";
	}
}

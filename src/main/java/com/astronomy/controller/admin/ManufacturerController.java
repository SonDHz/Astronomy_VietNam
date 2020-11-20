package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.mapper.ManufacturerMapper;

@Controller
@RequestMapping(value = "admin")
public class ManufacturerController {

	@Autowired
	IManufacturerService service;

	@Autowired
	ManufacturerMapper mapper;

	@GetMapping("manufacturer")
	public String manufacturer(Model model) {
		List<ManufacturerEntity> list = service.getAll();
		model.addAttribute("entity", list);
		model.addAttribute("dto", new ManufacturerCreateModifyDTO());
		return "admin/manufacturer_manager";
	}

	@PostMapping(value = "insert")
	public String manufacturerInsert(@ModelAttribute("dto") ManufacturerCreateModifyDTO dto) {
		ManufacturerEntity manufacturer = new ManufacturerEntity();
		manufacturer = mapper.toManufacturer(dto);
		mapper.toManufacturerResponserDTO(service.createModify(manufacturer));
		return "redirect:/admin/manufacturer";
	}

	@RequestMapping("delete/{id}")
	public String manufacturerDelete(@PathVariable Long id, Model model) {
		service.delete(id);
		System.out.println("Delete successful");
		return "redirect:/admin/manufacturer";
	}
	
	@RequestMapping("showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable Long id, Model model) {
		System.out.println("update");
		ManufacturerEntity manufacturer = service.getEntityById(id);
		System.out.println("Update: " + manufacturer);
		model.addAttribute("dtoUpdate", manufacturer);
		return "redirect:/admin/manufacturer";
	}
}

package com.astronomy.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.mapper.ManufacturerMapper;

@RequestMapping(value = "admin")
@Controller
public class ManufacturerController {

	@Autowired
	IManufacturerService service;

	@Autowired
	ManufacturerMapper mapper;

	@GetMapping("manufacturerView")
	public String manufacturerView(Model model) {
		List<ManufacturerEntity> list = service.getAll();
		model.addAttribute("entity", list);
		return "admin/manufacturer_manager";
	}

	@GetMapping("createModify/manufacturer")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		ManufacturerCreateModifyDTO dto = new ManufacturerCreateModifyDTO();
		if (id != null) {
			dto = service.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		return "admin/action/actionManufacturer";
	}

}

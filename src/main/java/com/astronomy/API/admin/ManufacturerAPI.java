package com.astronomy.API.admin;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.mapper.ManufacturerMapper;

@RestController
@RequestMapping(value = "api")
public class ManufacturerAPI {

	@Autowired
	private ManufacturerMapper manufacturerMapper;

	@Autowired
	private IManufacturerService manufacturerService;
	
	
	@PostMapping("Manufacturer")
	public ResponseEntity<ManufacturerCreateModifyDTO> createManufacturer(
			@Valid @RequestBody ManufacturerCreateModifyDTO dto, Model model){
		ManufacturerEntity entity = manufacturerMapper.toManufacturer(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(manufacturerMapper.toManufacturerResponserDTO(manufacturerService.createModify(entity)));
	}
	
	@PutMapping("Manufacturer")
	public ResponseEntity<ManufacturerCreateModifyDTO> updateManufacturer(
			@RequestBody ManufacturerCreateModifyDTO dto, Model model){
		ManufacturerEntity entity = manufacturerMapper.toManufacturer(dto);
		model.addAttribute("model", dto);
		return ResponseEntity.ok(manufacturerMapper.toManufacturerResponserDTO(manufacturerService.createModify(entity)));
	}
	
//	@PutMapping("Manufacturer")
//	public ResponseEntity<ManufacturerEntity> updateManufacturer(
//			@RequestBody ManufacturerEntity entity, Model model){
//		ManufacturerCreateModifyDTO dto = manufacturerMapper.toManufacturerResponserDTO(entity);
//		model.addAttribute("model", dto);
//		return ResponseEntity
//				.ok(manufacturerMapper.toManufacturer(manufacturerService.createModify(dto)));
//	}

	@DeleteMapping("Manufacturer")
	public void delete(@RequestBody long[] ids) {
		manufacturerService.delete(ids);
	}

	@GetMapping("Manufacturer")
	public List<ManufacturerEntity> getAll() {
		return manufacturerService.getAll();
	}
}

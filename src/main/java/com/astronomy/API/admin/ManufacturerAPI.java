package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

//	@PostMapping("Manufacturer")
//	public ResponseEntity<ManufacturerCreateModifyDTO> createManufacturer(
//			@RequestBody ManufacturerCreateModifyDTO dto, Model model){
//		model.addAttribute("manufacturer", dto);
//		ManufacturerEntity manufacturer = manufacturerMapper.toManufacturer(dto);
//		return ResponseEntity
//				.ok(manufacturerMapper.toManufacturerResponserDTO(manufacturerService.createModify(manufacturer)));
//	}
	
	@PostMapping("Manufacturer")
	public ResponseEntity<ManufacturerEntity> createManufacturer(
			@RequestBody ManufacturerEntity entity, Model model){
		ManufacturerCreateModifyDTO dto = manufacturerMapper.toManufacturerResponserDTO(entity);
		model.addAttribute("model", dto);
		return ResponseEntity
				.ok(manufacturerMapper.toManufacturer(manufacturerService.createModify(dto)));
	}
	
	@PutMapping("Manufacturer")
	public ResponseEntity<ManufacturerEntity> updateManufacturer(
			@RequestBody ManufacturerEntity entity, Model model){
		ManufacturerCreateModifyDTO dto = manufacturerMapper.toManufacturerResponserDTO(entity);
		model.addAttribute("model", dto);
		return ResponseEntity
				.ok(manufacturerMapper.toManufacturer(manufacturerService.createModify(dto)));
	}

//	@PutMapping("Manufacturer/{id}")
//	public ResponseEntity<ManufacturerCreateModifyDTO> updateManufacturer(@RequestBody ManufacturerCreateModifyDTO dto,
//			@PathVariable("id") long id) {
//		System.out.println("Update Ok");
//		dto.setId(id);
//		ManufacturerEntity manufacturer = manufacturerMapper.toManufacturer(dto);
//		return ResponseEntity
//				.ok(manufacturerMapper.toManufacturerResponserDTO(manufacturerService.createModify(manufacturer)));
//	}
	
//	@PutMapping("Manufacturer/{id}")
//	public ResponseEntity<ManufacturerEntity> updateManufacturer(@RequestBody ManufacturerEntity entity,
//			@PathVariable("id") long id, Model model) {
//		System.out.println("Update Ok");
//		entity.setId(id);
//		ManufacturerCreateModifyDTO dto = manufacturerMapper.toManufacturerResponserDTO(entity);
//		model.addAttribute("model", model);
//		return ResponseEntity
//				.ok(manufacturerMapper.toManufacturer(manufacturerService.createModify(dto)));
//	}

	@DeleteMapping("Manufacturer")
	public void delete(@RequestBody long id) {
		manufacturerService.delete(id);
	}

	@GetMapping("Manufacturer")
	public List<ManufacturerEntity> getAll() {
		return manufacturerService.getAll();
	}
}

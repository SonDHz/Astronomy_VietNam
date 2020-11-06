package com.astronomy.API.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.mapper.ManufacturerMapper;



@RestController
public class ManufacturerAPI {
	@Autowired
	private ManufacturerMapper manufacturerMapper;
	
	@Autowired
	private IManufacturerService manufacturerService;
	
	@PostMapping("/api/Manufacturer")
	public ResponseEntity<ManufacturerCreateModifyDTO> createManufacturer(@RequestBody ManufacturerCreateModifyDTO dto){
		ManufacturerEntity manufacturer = manufacturerMapper.toManufacturer(dto);
		return ResponseEntity.ok(manufacturerMapper.toManufacturerResponserDTO(manufacturerService.create(manufacturer)));
	}
	@PutMapping("/api/Manufacturer/{id}")
	public ResponseEntity<ManufacturerCreateModifyDTO> updateManufacturer(@RequestBody ManufacturerCreateModifyDTO dto, @PathVariable("id") long id){
		dto.setId(id);
		ManufacturerEntity manufacturer = manufacturerMapper.toManufacturer(dto);
		return ResponseEntity.ok(manufacturerMapper.toManufacturerResponserDTO(manufacturerService.create(manufacturer)));
	}
	@DeleteMapping("/api/Manufacturer")
	public void delete(@RequestBody long [] ids) {
		manufacturerService.delete(ids);
	}
	@GetMapping("/api/Manufacturer")
	public List<ManufacturerEntity> getAll(){
		return manufacturerService.getAll();
	}
}

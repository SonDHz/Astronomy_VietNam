package com.astronomy.Service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.mapper.ManufacturerMapper;
import com.astronomy.repository.ManufacturerRepository;

@Service
@Transactional
public class ManufacturerEntityService implements IManufacturerService {

	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	@Autowired
	private ManufacturerMapper mapper;

	@Override
	public List<ManufacturerEntity> getAll() {
		return manufacturerRepository.findAll();
	}
	
	@Override
	public ManufacturerCreateModifyDTO createModify(ManufacturerCreateModifyDTO dto) {
		ManufacturerEntity entity = new ManufacturerEntity();
		entity = mapper.toManufacturer(dto);
		entity = manufacturerRepository.save(entity);
		return dto;
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			manufacturerRepository.deleteById(id);
		}
	}

	@Override
	public ManufacturerCreateModifyDTO findByIdDTO(long id) {
		ManufacturerEntity manufacturer = manufacturerRepository.findById(id).orElse(null);
		return mapper.toManufacturerResponserDTO(manufacturer);
	}
}

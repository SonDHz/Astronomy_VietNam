package com.astronomy.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astronomy.Service.IManufacturerService;
import com.astronomy.entity.ManufacturerEntity;
import com.astronomy.repository.ManufacturerRepository;

@Service
public class ManufacturerEntityService implements IManufacturerService {

	@Autowired
	private ManufacturerRepository manufacturerRepository;

	@Override
	public List<ManufacturerEntity> getAll() {
		return manufacturerRepository.findAll();
	}

	@Override
	public ManufacturerEntity createModify(ManufacturerEntity manufacturerEntity) {
		return manufacturerRepository.save(manufacturerEntity);
	}
	
	@Override
	public ManufacturerEntity getEntityById(long id) {
		ManufacturerEntity entity = manufacturerRepository.findById(id).orElse(null);
		return entity;
	}

	
	@Override
	public void delete(Long ids) {
		manufacturerRepository.deleteById(ids);
		return;
	}

}

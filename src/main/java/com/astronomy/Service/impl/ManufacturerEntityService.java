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
	public ManufacturerEntity create(ManufacturerEntity manufacturerEntity) {
		return manufacturerRepository.save(manufacturerEntity);
	}

	@Override
	public ManufacturerEntity update(ManufacturerEntity manufacturerEntity) {
		// TODO Auto-generated method stub
		return manufacturerRepository.save(manufacturerEntity);
	}

	@Override
	public void delete(long[] ids) {
		for (long item : ids ) {
			manufacturerRepository.deleteById(item);
		}	
	}

	@Override
	public List<ManufacturerEntity> getAll() {
		// TODO Auto-generated method stub
		return manufacturerRepository.findAll();
	}	
}

package com.astronomy.Service;

import java.util.List;

import com.astronomy.entity.ManufacturerEntity;

public interface IManufacturerService {
	
	List <ManufacturerEntity> getAll();
	
	ManufacturerEntity createModify(ManufacturerEntity manufacturerEntity);
	
	ManufacturerEntity getEntityById(long id);
	
	void delete(Long id);
	
}

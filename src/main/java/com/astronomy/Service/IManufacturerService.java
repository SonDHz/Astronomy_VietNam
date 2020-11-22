package com.astronomy.Service;

import java.util.List;

import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;

public interface IManufacturerService {
	
	List <ManufacturerEntity> getAll();
	
	ManufacturerCreateModifyDTO createModify(ManufacturerCreateModifyDTO dto);
	
	ManufacturerCreateModifyDTO findByIdDTO(long id);
	
	void delete(Long id);
	
}

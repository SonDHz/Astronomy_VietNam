package com.astronomy.Service;

import java.util.List;
import java.util.Map;

import com.astronomy.dto.ManufacturerCreateModifyDTO;
import com.astronomy.entity.ManufacturerEntity;

public interface IManufacturerService {
	
	List <ManufacturerEntity> getAll();
	
	Map<Long, String> findAll();
	
//	ManufacturerCreateModifyDTO createModify(ManufacturerCreateModifyDTO dto);
	
	ManufacturerEntity createModify(ManufacturerEntity entity);
	
	ManufacturerCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
}

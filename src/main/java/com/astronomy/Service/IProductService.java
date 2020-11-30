package com.astronomy.Service;

import java.util.List;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;

public interface IProductService {
	
	List <ProductEntity> getAll();
	
	ProductCreateModifyDTO createModify(ProductCreateModifyDTO dto);
	
	ProductCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
}

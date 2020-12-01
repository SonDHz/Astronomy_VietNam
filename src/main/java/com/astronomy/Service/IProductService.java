package com.astronomy.Service;

import java.util.List;
import com.astronomy.dto.ProductCreateModifyDTO;
import com.astronomy.entity.ProductEntity;

public interface IProductService {
	
	List <ProductEntity> getAll();
	
	ProductEntity createModify(ProductEntity dto);
	
	ProductCreateModifyDTO findByIdDTO(long id);
	
	void delete(long[] ids);
	
}

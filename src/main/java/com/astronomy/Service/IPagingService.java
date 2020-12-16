package com.astronomy.Service;

import com.astronomy.dto.PagingDTO;

public interface IPagingService {
	 PagingDTO getPagingbycategory(int totalData, int limit, int currentPage);
	
	
}

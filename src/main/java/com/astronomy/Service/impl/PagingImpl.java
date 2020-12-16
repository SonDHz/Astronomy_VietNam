package com.astronomy.Service.impl;

import org.springframework.stereotype.Service;

import com.astronomy.Service.IPagingService;
import com.astronomy.dto.PagingDTO;

@Service
public class PagingImpl implements IPagingService {

	@Override
	public PagingDTO getPagingbycategory(int totalData, int limit, int currentPage) {
		PagingDTO paging = new PagingDTO();
		paging.setLimit(limit);
		paging.setTotalPage(SetInfoTotalPage(totalData,limit));
		paging.setCurrentPage(checkCurrentPage(currentPage,paging.getTotalPage()));
		int start = findStart(paging.getCurrentPage(),limit);
		paging.setStart(start);
		int end = findEnd(paging.getCurrentPage(),limit, totalData);;
		paging.setEnd(end);
		return paging;
	}

	

	private int findEnd(int start, int limit, int totalData) {
		return start + limit > totalData ? totalData : (start+limit)-1;
	}



	private int findStart(int currentPage, int limit) {
		return ((currentPage - 1 )* limit)+1;
	}

	private int SetInfoTotalPage(int totalData, int limit) {
		int totalPage =  0;
		totalPage =  totalData / limit ;
		totalPage = totalPage * limit < totalData ?  totalPage+1 :totalPage;
		return totalPage;
	}
	
	private int checkCurrentPage(int currentPage, int totalPage) {
		if (currentPage < 1) {
			return 1;
		} 
		if(currentPage >totalPage ) {
			return totalPage;
		}
		return currentPage;
	}
	
}

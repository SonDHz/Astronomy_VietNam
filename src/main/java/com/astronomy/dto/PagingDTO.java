package com.astronomy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class PagingDTO {
	private int currentPage;
	private int limit;
	private int start;
	private int end;
	private int totalPage;
	
}

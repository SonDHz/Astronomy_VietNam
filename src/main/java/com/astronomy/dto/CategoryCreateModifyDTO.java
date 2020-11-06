package com.astronomy.dto;

import java.io.Serializable;

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
public class CategoryCreateModifyDTO implements Serializable{

	private static final long serialVersionUID =1L;
	
	private Long id;
	private String code;
	private String name;
	private String createBy;
	private String modifyBy;
	
}


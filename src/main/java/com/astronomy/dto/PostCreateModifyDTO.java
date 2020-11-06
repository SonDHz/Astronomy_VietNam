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
public class PostCreateModifyDTO {

	private Long id;
	private String title;
	private String shortDescription;
	private String thumbnail;
	private String content;
	private String createBy;	
	private String modifyBy;
	private Long category;
	
}

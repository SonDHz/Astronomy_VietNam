package com.astronomy.dto;

import java.util.Date;

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
public class OrderCreateModifyDTO {
	private Long id;
	private Date createdDate;
	private Date modifiedDate;
	private String name;
	private String createdBy;
	private String modifiedBy;
}

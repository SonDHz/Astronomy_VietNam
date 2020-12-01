package com.astronomy.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class RoleCreateModifyDTO {
	private Long id;
	private String roleName;
	private String code;
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
}

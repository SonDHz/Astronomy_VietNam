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
public class UserCreateModifyDTO {
	private Long id;
	private String username;
	private String password;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String address;
	private Integer status;
//	private Date createdDate;
//	private Date modifiedDate;
//	private String createdBy;
//	private String modifiedBy;
}

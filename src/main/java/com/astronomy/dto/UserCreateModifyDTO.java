package com.astronomy.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.astronomy.entity.RoleEntity;
import com.astronomy.entity.UserEntity;
import com.astronomy.entity.UserEntity.UserEntityBuilder;

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
public class UserCreateModifyDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String username;
	private String password;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String address;
	private Integer gender;
	private Date birthday;
	private String avatar;
	private Integer status;
	private String createBy; 
	private String modifyBy;
}

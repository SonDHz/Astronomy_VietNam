package com.astronomy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "role")
@Builder
@ToString
public class RoleEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rolename")
	private String roleName;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "createby")
	private String createBy;
	
	@Column(name = "modifyby")
	private String modifyBy;
	
	@ManyToMany(mappedBy = "roles")
	private List<UserEntity> users = new ArrayList<>();
}
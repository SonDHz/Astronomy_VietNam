package com.astronomy.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
@Builder
@ToString
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "createddate", updatable = false)
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "modifieddate", updatable = true)
	@LastModifiedDate
	private Date modifiedDate;
	
	@Column(name = "createdby", updatable = false)
	@CreatedBy
	private String createdBy;
	
	@Column(name = "modifiedby", updatable = true)
	@LastModifiedBy
	private String modifiedBy;
	
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "fullname")
	private String fullName;

	@Column(name = "email")
	private String email;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "gender")
	private Integer gender;
	
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date birthday;

	@Column(name = "avatar")
	private String avatar;

	@Column(name = "status")
	private Integer status;
	
	@OneToMany(mappedBy = "user")
	private List<ProductEntity> products = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<PostEntity> post = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), 
								  inverseJoinColumns = @JoinColumn(name = "roleid"))
	private List<RoleEntity> roles = new ArrayList<>();

//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "roleid"))
//	private List<RoleEntity> roles = new ArrayList<RoleEntity>();

}

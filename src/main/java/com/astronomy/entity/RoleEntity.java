package com.astronomy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
@EntityListeners(AuditingEntityListener.class)
@Builder
@ToString
public class RoleEntity {
	
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
	
	@Column(name = "rolename")
	private String roleName;
	
	@Column(name = "code")
	private String code;
	
	public RoleEntity(String code) {
		super();
		this.code = code;
	}

	@ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();
}

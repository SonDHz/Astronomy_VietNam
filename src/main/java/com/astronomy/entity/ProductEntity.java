package com.astronomy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

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
@Table(name = "product")
@Builder
@ToString
public class ProductEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "shortdecription")
	private String shortDecription;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "quantity")
	private String quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productcategory_id")
	private ProductCategory productCategory;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manufacturer_id")
	private ManufacturerEntity manufacturer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderdetail_id")
	private OrderDetailEntity orderDetail;
	
}

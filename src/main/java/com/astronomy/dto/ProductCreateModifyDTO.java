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
public class ProductCreateModifyDTO {
	private Long id;
	private String name;
	private String shortDecription; 
	private String status;	
	private String image;
	private Double price;
	private String quantity;
	private Long productCategory;
	private String productCategoryCode;
	private Long manufacturer;
	private Long orderDetail;
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
	private Integer page;
	private Integer limit;
	private Integer totalPage;
	private Integer totalItem;
	
	
}

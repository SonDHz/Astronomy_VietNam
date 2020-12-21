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
public class OrderDetailCreateModifyDTO {
	private Long id;
	private Long userID;
	private Double total;
	private Double price;
	private Integer quantity;
	private long order;
	private long product;
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
}

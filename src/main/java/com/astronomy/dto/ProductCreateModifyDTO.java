package com.astronomy.dto;

import java.io.Serializable;


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
public class ProductCreateModifyDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String shortDecription; // mô tả
	private String status;
	private String image;
	private Double price;
	private String quantity;
	private Long productCategory;
	private Long manufacturer;
	private Long orderDetail;//??
}

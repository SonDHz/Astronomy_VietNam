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
public class OrderDetailCreateModifyDTO	 implements Serializable {
	private Long id;
	private Double total;
	private Double price;
	private Integer quantity;
	private long order;
	// hoa don chi tiet
}

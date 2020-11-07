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
public class OrderCreateModifyDTO implements Serializable {
	private Long id;
	private String createBy;
	private String modifyBy;
	// hóa đơn
}

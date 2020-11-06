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
public class ProductCategoryCreateModifyDTO implements Serializable {
	private Long id;
	private String name;
	private String code;
	private String createBy;
	private String modifyBy;
	// Loại sản phẩm
}

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
public class ManufacturerCreateModifyDTO implements Serializable{
	private Long id;
	private String name;
	private String createBy;
	private String modifyBy;
	// Nhà sản xuất
}

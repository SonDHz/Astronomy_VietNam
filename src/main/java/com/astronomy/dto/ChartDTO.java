package com.astronomy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ChartDTO {
	private Integer id;
	private Double label;
	private String name;
	private Double value;
}

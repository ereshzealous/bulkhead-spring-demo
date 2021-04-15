package com.spring.bulkhead.player.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created on 15/April/2021 By Author Eresh, Gorantla
 **/
@Data
@AllArgsConstructor
public class PlayerVO {
	private Integer id;
	private String name;
	private String sport;
	private String country;
	private Integer age;
}
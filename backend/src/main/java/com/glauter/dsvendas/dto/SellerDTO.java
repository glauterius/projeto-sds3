package com.glauter.dsvendas.dto;

import java.io.Serializable;

import com.glauter.dsvendas.entity.SellerEntity;


public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	public SellerDTO() {
		super();
	}
	
	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(SellerEntity entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

}

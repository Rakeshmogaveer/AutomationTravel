package com.travel.model;

import org.springframework.stereotype.Component;

@Component
public class AdminDTO extends UserDTO{
	
	private String designation;

	public AdminDTO() {
		super();
	}

	public AdminDTO(String designation) {
		super();
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Admin [designation=" + designation + "]";
	}
	
	

}

package com.travel.model;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class DriverDTO extends UserDTO {

	private int driverId;
	
	@NotNull
	private String licenceNo;

	public DriverDTO() {
		super();
	}
	
	

	public DriverDTO(int driverId ,@NotNull String licenceNo) {
		super();
		this.driverId=driverId;
		this.licenceNo = licenceNo;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}



	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}



	@Override
	public String toString() {
		return "DriverDTO [driverId=" + driverId + ", licenceNo=" + licenceNo + "]";
	}

	
	
	
	
	
}

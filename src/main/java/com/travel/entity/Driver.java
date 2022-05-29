package com.travel.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="driver1")
public class Driver extends User {

	@NotNull
	private String licenceNo;
	
	@OneToOne
    @JoinColumn(name="vehicleNo")
	private Vehicle vehicle;

	public Driver() {
		super();
	}

	public Driver( @NotNull String licenceNo, Vehicle vehicle) {
		super();
		
		this.licenceNo = licenceNo;
		this.vehicle = vehicle;
	}

	

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Driver [licenceNo=" + licenceNo + ", vehicle=" + vehicle + "]";
	}

	
	

	
	
	
	
	
	
}

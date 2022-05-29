package com.travel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleNo;

	@NotNull
	private String vehicleName;

	@Min(4)
	private int seatingCapacity;

	@NotNull
	private String vehicleType;

	@Min(10)
	private float farePerKM;
		
	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleNo, @NotNull String vehicleName, @Min(4) int seatingCapacity, @NotNull String vehicleType,
			@Min(10) float farePerKM) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
		this.seatingCapacity = seatingCapacity;
		this.vehicleType = vehicleType;
		this.farePerKM = farePerKM;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public float getFarePerKM() {
		return farePerKM;
	}

	public void setFarePerKM(float farePerKM) {
		this.farePerKM = farePerKM;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleName=" + vehicleName + ", seatingCapacity="
				+ seatingCapacity + ", vehicleType=" + vehicleType + ", farePerKM=" + farePerKM + "]";
	}

	
}

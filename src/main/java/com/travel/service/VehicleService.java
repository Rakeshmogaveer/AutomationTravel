package com.travel.service;

import com.travel.entity.Vehicle;
import com.travel.exception.VehicleNotFoundException;
import com.travel.model.VehicleDTO;

public interface VehicleService {

	public Vehicle addVehicle(VehicleDTO vehicleDto);
	public String deleteVehicle(int vehicleNo)throws VehicleNotFoundException;
	public VehicleDTO viewVehicle(int vehicleNo)throws VehicleNotFoundException;
	public Vehicle modifyVehicle(VehicleDTO vehicleDto)throws VehicleNotFoundException;
}

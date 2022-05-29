package com.travel.service;

import com.travel.entity.Driver;
import com.travel.exception.DriverNotFoundException;
import com.travel.model.DriverDTO;

public interface DriverService {

	public Driver addDriver(DriverDTO driverDto);
	public Driver deleteDriver(int userId)throws DriverNotFoundException;
	public DriverDTO viewDriver(int userId)throws DriverNotFoundException;
	public Driver modifyDriver (DriverDTO driverDto) throws DriverNotFoundException;
}

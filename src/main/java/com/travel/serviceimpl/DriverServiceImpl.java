package com.travel.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.entity.Driver;
import com.travel.exception.DriverNotFoundException;
import com.travel.model.DriverDTO;
import com.travel.repo.DriverRepository;
import com.travel.service.DriverService;
import com.travel.util.ConversionClass;
@Service
public class DriverServiceImpl implements DriverService {

	private static Logger logDriver = LoggerFactory.getLogger(DriverServiceImpl.class);
	@Autowired
	private DriverRepository driverRepository;

	@Autowired
	private ConversionClass converter;

	@Override
	public Driver addDriver(DriverDTO driverDto) {
		return driverRepository.save(converter.convertToDriverEntity(driverDto));
	}

	@Override
	public Driver deleteDriver(int driverId) throws DriverNotFoundException {
		Optional<Driver> driver = driverRepository.findById(driverId);
		String message = null;
		Driver dri = null;
		if (driver.isPresent()) {
			driverRepository.deleteById(driverId);
			message = "Driver Deleted Successfully";

		} else {
			message = "No Driver Found";
			throw new DriverNotFoundException(message);
		}
		return dri;
	}

	@Override
	public DriverDTO viewDriver(int driverId) throws DriverNotFoundException {
		Optional<Driver> Driver = driverRepository.findById(driverId);
		DriverDTO dto = null;
		Driver dri = null;
		if (Driver.isPresent()) {
			dri = Driver.get();
			dto = converter.convertToDriverDTO(dri);
			System.out.println(dto);

		} else {
			throw new DriverNotFoundException("No such Driver Found");
		}
		return dto;
	}

	@Override
	public Driver modifyDriver(DriverDTO driverDto) {
		Optional<Driver> Driver = driverRepository.findById(driverDto.getDriverId());
		Driver driverRecord = null;
		if (Driver.isPresent()) {
			driverRecord = Driver.get();
			driverRepository.save(converter.convertToDriverEntity(driverDto));

		} else {
			logDriver.error("Driver Not Found");
			throw new DriverNotFoundException("Driver Not Found");
		}

		return driverRecord;

	}

}

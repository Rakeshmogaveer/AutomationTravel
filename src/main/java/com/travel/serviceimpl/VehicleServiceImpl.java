package com.travel.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.entity.Route;
import com.travel.entity.Vehicle;
import com.travel.exception.VehicleNotFoundException;
import com.travel.model.VehicleDTO;
import com.travel.repo.VehicleRepository;
import com.travel.service.VehicleService;
import com.travel.util.ConversionClass;

@Service
public class VehicleServiceImpl implements VehicleService{
	private static Logger logVehicle = LoggerFactory.getLogger(VehicleServiceImpl.class);
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private ConversionClass converter;

	@Override
	public Vehicle addVehicle(VehicleDTO vehicleDto) {
		
		return vehicleRepository.save(converter.convertToVehicleEntity(vehicleDto));
	}

	

	@Override
	public String deleteVehicle(int vehicleId) throws VehicleNotFoundException {
		
		Optional<Vehicle> Vehicle = vehicleRepository.findById(vehicleId);
		String message=null;
		Route veh = null;
		if(Vehicle.isPresent()) {
			vehicleRepository.deleteById(vehicleId);
			message="Route Deleted Successfully";
			
		}else {
			message="No Vehicle Found";
			throw new VehicleNotFoundException(message);
		}
		return message;
		
	}

	@Override
	public VehicleDTO viewVehicle(int vehicleId) throws VehicleNotFoundException {
		
		Optional<Vehicle> Vehicle = vehicleRepository.findById(vehicleId);
		VehicleDTO dto=null;
		Vehicle veh = null;
		if(Vehicle.isPresent()) {
			veh =Vehicle.get();
			 dto=converter.convertToVehicleDTO(veh);
			System.out.println(dto);
			
		}else {
			throw new VehicleNotFoundException("No such Vehicle Found");
		}
		return dto;
		
	}



	@Override
	public Vehicle modifyVehicle(VehicleDTO vehicleDto) throws VehicleNotFoundException {
		Optional<Vehicle> vehicle = vehicleRepository.findById(vehicleDto.getVehicleNo());
		Vehicle vehicleRecord=null;
		if(vehicle.isPresent()) {
			vehicleRecord= vehicle.get();
			vehicleRepository.save(converter.convertToVehicleEntity(vehicleDto));
			
		}
		else {
			logVehicle.error("Vehicle Not Found");
			throw new VehicleNotFoundException("Vehicle Not Found");
		}
		

		return vehicleRecord;
	}
	

}



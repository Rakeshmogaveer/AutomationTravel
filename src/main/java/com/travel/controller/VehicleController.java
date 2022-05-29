package com.travel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.entity.Vehicle;
import com.travel.exception.VehicleNotFoundException;
import com.travel.model.VehicleDTO;
import com.travel.service.VehicleService;
@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping(value = "/addVehicle")
	public Vehicle addVehicle(@RequestBody @Valid VehicleDTO vehicleDto) {
		return vehicleService.addVehicle(vehicleDto);
	}
	
	@PutMapping(value = "/modifyVehicle")
	public Vehicle modifyVehicle(@RequestBody @Valid   VehicleDTO vehicleDto) throws VehicleNotFoundException{
		return vehicleService.modifyVehicle(vehicleDto);
	}
	
	@DeleteMapping(value = "/deleteVehicle/{id}")
	public String deleteVehicle(@PathVariable("id") int vehicleId) throws VehicleNotFoundException {
		return vehicleService.deleteVehicle(vehicleId);
	}
	
	@GetMapping(value = "/getVehicle/{id}")
	public  VehicleDTO viewVehicle(@PathVariable("id") int vehicleId) throws VehicleNotFoundException{
		return vehicleService.viewVehicle(vehicleId);
	}
	

}



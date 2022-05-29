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

import com.travel.entity.Driver;
import com.travel.exception.DriverNotFoundException;
import com.travel.model.DriverDTO;
import com.travel.service.DriverService;

@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class DriverController {

	@Autowired
	private DriverService driverService;
	

	@PostMapping(value = "/addDriver")
	public Driver addDriver(@RequestBody @Valid DriverDTO driverDto) {
		return driverService.addDriver(driverDto);
	}
	
	@DeleteMapping(value = "/deleteDriver/{id}")
	public Driver deleteDriver(@PathVariable("id") int userId) throws DriverNotFoundException {
		return driverService.deleteDriver(userId);
	}
	
	@GetMapping(value = "/getDriver/{id}")
	public DriverDTO viewDriver(@PathVariable("id") int userId) throws DriverNotFoundException{
		return driverService.viewDriver(userId);
	}
	
	@PutMapping(value = "/modifyDriver")
	public Driver modifyDriver(@RequestBody @Valid  DriverDTO driverDto) throws DriverNotFoundException{
		return driverService.modifyDriver(driverDto);
	}
}

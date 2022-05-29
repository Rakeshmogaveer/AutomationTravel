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

import com.travel.entity.Route;
import com.travel.exception.RouteNotFoundException;
import com.travel.model.RouteDTO;
import com.travel.service.RouteService;


@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class RouteController {
	
	@Autowired
	private RouteService routeService;
	
	@PostMapping(value = "/addRoute")
	public Route addRoute(@RequestBody @Valid RouteDTO routeDto) {
		return routeService.addRoute(routeDto);
	}
	
	@PutMapping(value = "/modifyRoute")
	public Route modifyRoute(@RequestBody @Valid  RouteDTO routeDto) throws RouteNotFoundException{
		return routeService.modifyRoute(routeDto);
	}
	
	@DeleteMapping(value = "/deleteRoute/{id}")
	public String deleteRoute(@PathVariable("id") int routeId) throws RouteNotFoundException {
		return routeService.deleteRoute(routeId);
	}
	
	@GetMapping(value = "/getRoute/{id}")
	public RouteDTO viewRoute(@PathVariable("id") int routeId) throws RouteNotFoundException{
		return routeService.viewRoute(routeId);
	}
	

}

package com.travel.service;

import com.travel.entity.Route;
import com.travel.exception.RouteNotFoundException;
import com.travel.model.RouteDTO;

public interface RouteService {
	
	public Route addRoute(RouteDTO routeDto);
	public Route modifyRoute( RouteDTO routeDTO)throws RouteNotFoundException;
	public String deleteRoute(int routeId)throws RouteNotFoundException;
	public RouteDTO viewRoute(int routeId) throws RouteNotFoundException;
	
	
	
	
	

}

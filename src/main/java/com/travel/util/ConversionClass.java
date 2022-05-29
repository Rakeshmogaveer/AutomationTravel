package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.entity.Booking;
import com.travel.entity.Customer;
import com.travel.entity.Driver;
import com.travel.entity.Route;
import com.travel.entity.Vehicle;
import com.travel.model.BookingDTO;
import com.travel.model.CustomerDTO;
import com.travel.model.DriverDTO;
import com.travel.model.RouteDTO;
import com.travel.model.VehicleDTO;

@Component
public class ConversionClass {
	
//	public static User convertToUserEntity(UserDTO userDto)
//	{
//		User user=new User();
//		BeanUtils.copyProperties(userDto, user);
//		return user;
//		
//	}
//	public static UserDTO convertToUserDTO(User user)
//	{
//		UserDTO userDto=new UserDTO();
//		BeanUtils.copyProperties( user,userDto);
//		return userDto;
//		
//	}
	
	
	public  Route convertToRouteEntity(RouteDTO routeDto) {
		Route route=new Route();
		BeanUtils.copyProperties(routeDto, route);
		return route;
		
	}
	
	public  RouteDTO convertToRouteDTO(Route route) {
		RouteDTO routeDto=new RouteDTO();
		BeanUtils.copyProperties(route,routeDto);
		return routeDto;
		
	}
	
	public Booking convertToBookingEntity(BookingDTO bookingDto) {
		Booking booking=new Booking();
		BeanUtils.copyProperties(bookingDto, booking);
		return booking;
	}
	
	public  BookingDTO convertToBookingDTO(Booking booking) {
		BookingDTO bookingDto=new BookingDTO();
		BeanUtils.copyProperties(booking,bookingDto);
		return bookingDto;
	}
	
	public  Driver convertToDriverEntity(DriverDTO driverDto) {
		Driver driver=new Driver();
		BeanUtils.copyProperties(driverDto, driver);
		return driver;
		
	}
	
	public  DriverDTO convertToDriverDTO(Driver driver) {
		DriverDTO driverDto=new DriverDTO();
		BeanUtils.copyProperties(driver,driverDto);
		return driverDto;
		
	}
	
	public  Customer convertToCustomerEntity(CustomerDTO customerDto) {
		Customer customer=new Customer();
		BeanUtils.copyProperties(customerDto, customer);
		return customer;
		
	}
	
	public  CustomerDTO convertToCustomerDTO(Customer customer) {
		CustomerDTO customerDto=new CustomerDTO();
		BeanUtils.copyProperties(customer,customerDto);
		return customerDto;
		
	}
	public  Vehicle convertToVehicleEntity(VehicleDTO vehicleDto) {
		Vehicle vehicle=new Vehicle();
		BeanUtils.copyProperties(vehicleDto, vehicle);
		return vehicle;
		
	}

	public VehicleDTO convertToVehicleDTO(Vehicle vehicle) {
		VehicleDTO vehicleDto=new VehicleDTO();
		BeanUtils.copyProperties(vehicle,vehicleDto);
		return vehicleDto;
		
	}
}

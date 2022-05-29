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

import com.travel.entity.Booking;
import com.travel.exception.BookingNotFoundException;
import com.travel.model.BookingDTO;
import com.travel.service.BookingService;

@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping(value = "/bookVehicle")
	public Booking bookVehicle(@RequestBody @Valid BookingDTO bookingDto) {
		return bookingService.bookVehicle(bookingDto);
	}
	
	@PutMapping(value = "/viewVehicle")
	public BookingDTO viewBooking(@PathVariable("id") int bookingId) throws BookingNotFoundException {
		return bookingService.viewBooking(bookingId);
	}
	
	@DeleteMapping(value = "/cancelVehicle/{id}")
	public String deleteBooking(@PathVariable("id") int bookingId) throws BookingNotFoundException {
		return bookingService.cancelBooking(bookingId);
	}
	
	@GetMapping(value = "/viewBookingStatus")
	public BookingDTO getBooking(@PathVariable("id") int bookingId) throws BookingNotFoundException{
		return bookingService.viewBookingStatus(bookingId);
	}
}
package com.travel.service;


import com.travel.entity.Booking;
import com.travel.exception.BookingNotFoundException;
import com.travel.model.BookingDTO;

public interface BookingService {
	
	public Booking bookVehicle(BookingDTO bookingDto);
	public BookingDTO viewBooking(int bookingId) throws BookingNotFoundException;
	public String cancelBooking(int bookingId) throws BookingNotFoundException;
	public BookingDTO viewBookingStatus(int bookingId) throws BookingNotFoundException;
	
	
}

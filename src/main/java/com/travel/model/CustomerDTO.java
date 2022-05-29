package com.travel.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CustomerDTO extends UserDTO {
	
	private List<BookingDTO> bookings=new ArrayList<>();

	public CustomerDTO() {
		super();
	}


	public CustomerDTO(List<BookingDTO> bookings) {
		super();
		this.bookings = bookings;
	}

	public List<BookingDTO> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingDTO> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Customer [bookings=" + bookings + "]";
	}
	
	
	

}

package com.travel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="customer1")
public class Customer extends User {
	
	@OneToMany(mappedBy = "customer",cascade= CascadeType.ALL )
	@JsonBackReference
	private List<Booking> bookings=new ArrayList<>();

	public Customer() {
		super();
	}


	public Customer(List<Booking> bookings) {
		super();
		this.bookings = bookings;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Customer [bookings=" + bookings + "]";
	}
	
	
	

}

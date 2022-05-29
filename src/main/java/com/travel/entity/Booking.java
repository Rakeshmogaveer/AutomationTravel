package com.travel.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	@NotNull
	private LocalDateTime bookingDate;
	
	@OneToOne
	@JoinColumn(name="routeId")
	private Route route;
	
	@Min(100)
	private float fare;
	
	@OneToOne
	@JoinColumn(name="userId",insertable=false, updatable=false)
	private Driver driver;
		
	@ManyToOne
	@JoinColumn(name="userId",insertable=false, updatable=false)
	@JsonManagedReference
	private Customer customer;

	public Booking() {
		super();
	}

	public Booking(int bookingId, @NotNull LocalDateTime bookingDate, Route route, @Min(100) float fare,
			Driver driver,Customer customer) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.route = route;
		this.fare = fare;
		this.driver = driver;
		this.customer=customer;
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public LocalDateTime getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}


	public Route getRoute() {
		return route;
	}


	public void setRoute(Route route) {
		this.route = route;
	}


	public float getFare() {
		return fare;
	}


	public void setFare(float fare) {
		this.fare = fare;
	}


	public Driver getDriver() {
		return driver;
	}


	public void setDriver(Driver driver) {
		this.driver = driver;
	}
		
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", route=" + route + ", fare="
				+ fare + ", driver=" + driver  + ", customer=" + customer + "]";
	}

	
	
	
	
	

}

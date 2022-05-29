package com.travel.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


@Component
public class BookingDTO {
	
	@NotNull
	private int bookingId;
	
	@NotNull
	private LocalDateTime bookingDate;
	
	private RouteDTO route;
	
	@Min(100)
	private float fare;
	
	private DriverDTO driver;
	
	private VehicleDTO vehicle;
	
	private CustomerDTO customer;

	public BookingDTO() {
		super();
	}

	public BookingDTO(@NotNull int bookingId, @NotNull LocalDateTime bookingDate, RouteDTO route, @Min(100) float fare,
			DriverDTO driver,VehicleDTO vehicle,CustomerDTO customer) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.route = route;
		this.fare = fare;
		this.driver = driver;
		this.vehicle=vehicle;
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


	public RouteDTO getRoute() {
		return route;
	}


	public void setRoute(RouteDTO route) {
		this.route = route;
	}


	public float getFare() {
		return fare;
	}


	public void setFare(float fare) {
		this.fare = fare;
	}


	public DriverDTO getDriver() {
		return driver;
	}


	public void setDriver(DriverDTO driver) {
		this.driver = driver;
	}
	
	public VehicleDTO getVehicle() {
		return vehicle;
	}


	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}
	
	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", route=" + route + ", fare="
				+ fare + ", driver=" + driver + ", vehicle=" + vehicle + ", customer=" + customer + "]";
	}

	
	
	
	
	

}

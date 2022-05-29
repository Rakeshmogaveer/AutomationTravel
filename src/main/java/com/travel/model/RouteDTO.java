package com.travel.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class RouteDTO {
	
	private int routeId;
	
	@NotNull
	private String source;
	
	@NotNull
	private String destination;
	
	@Min(1)
	private float distance;
	
	@Min(1)
	private float duration;
	
	public RouteDTO() {
		super();
	}

	public RouteDTO(int routeId, @NotNull String source, @NotNull String destination, @Min(1) float distance,
			@Min(1) float duration) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.duration = duration;
	}
	
	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", duration=" + duration + "]";
	}
	
	
	
	
	
	

}

package com.airplane.FlightSystem;

import java.util.Date;


public class BusinessClass extends Flight {
	private final int rate = 3 * 3; //economy class rate multiplied by 3
	
	public BusinessClass(String flightNumber, String departure, String destination, Date departureTime, Date arrivalTime, int availableSeats) {
		super(flightNumber, departure, destination, departureTime, arrivalTime, availableSeats);
		super.rate = this.rate;
	}

	

	
}





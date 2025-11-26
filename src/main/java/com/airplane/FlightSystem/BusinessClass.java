package com.airplane.FlightSystem;

import java.util.Date;


public class BusinessClass extends Flight {
	private double rate = 0.5;
//TODO: Create a rate for Business class fare calculation.
	public BusinessClass(String flightNumber, String departure, String destination, Date departureTime, Date arrivalTime, int availableSeats) {
		super(flightNumber, departure, destination, departureTime, arrivalTime, availableSeats);
	}

	}





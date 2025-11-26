package com.airplane.FlightSystem;

import java.util.Date;

public class EconomyClass extends Flight {
	private final int rate = 3; //pesos per k
	
	public EconomyClass(String flightNumber, String departure, String destination, Date departureTime, Date arrivalTime, int availableSeats) {
		super(flightNumber, departure, destination, departureTime, arrivalTime, availableSeats);
		super.rate = this.rate;
	}
} 
    


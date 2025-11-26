package com.airplane.FlightSystem;

import java.util.Date;

public class Flight {
	private String flightNumber;
	private String Source_destination;
	private String Target_destination;
	private Date departureTime;
	private Date arrivalTime;
	private int availableSeats;
	protected int fare;
	protected int rate;
	
	public Flight(String flightNumber, String Source_destination,
			 String Target_destination, Date departureTime, Date arrivalTime, 
			 int availableSeats) {
		this.flightNumber = flightNumber;
		this.Source_destination = Source_destination;
		this.Target_destination = Target_destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.availableSeats = availableSeats;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getSourceDestination() {
		return Source_destination;
	}
	
	public String getTargetDestination() {
		return Target_destination;
	}

	public void setSourceDestination(String destination) {
		this.Source_destination = destination;

	}
	
	public void setTargetDestination(String destination) {
		this.Target_destination = destination;

	}
	
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public int getAvailableSeats() {
		return availableSeats;
	}
	
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Date getDepartureTime() {
		return this.departureTime;
	}
	
	public void flightClass() {
		System.out.println("The flight has been engined");
		
	}
	
	public void displayFlight() {
		System.out.println(" --- Flight Details --- " );
		System.out.println("Flight Number: " + getFlightNumber());
		System.out.println("From: " + getSourceDestination());
		System.out.println("To: " + getTargetDestination());
		System.out.println("Departure: " + getDepartureTime());
		System.out.println("Arrival: " + getArrivalTime());
		System.out.println("Available Seats: " + getAvailableSeats());
	}
	public void checkSeatsAvailable() {
			if (getAvailableSeats() > 0) {
				System.out.println("The seats are available");
			} else {
				System.out.println("The seats are not available");
			}
	}	

	public boolean reserveSeats(int seatsToReserve) {
			if (seatsToReserve <= 0) {
				System.out.println("Invalid number of seats");
				return false;
			}
			
			if (getAvailableSeats() > seatsToReserve) {
				setAvailableSeats(getAvailableSeats() - seatsToReserve);
				System.out.println(seatsToReserve + " Seat reserved successfully");
				System.out.println("Seats Remaining in Economy Class: " + getAvailableSeats());
				return true;
			} else {
				System.out.println("No Available Seats" + getAvailableSeats());
				return false;
			}
			
		}

	public int getFare() {
		
		Fare fareCalculator = new Fare();
		double distance = Fare.calculateDistance(
				Fare.getLocationCoords(this.getSourceDestination()),
				Fare.getLocationCoords(this.getTargetDestination())
				);
		this.fare = fareCalculator.calculateFare(distance, this.rate);
		return fare;
	}	
}




		
	

	











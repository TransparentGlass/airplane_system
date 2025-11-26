package com.airplane;

import java.util.Date;

public abstract class Flight {
	private String flightNumber;
	private String departure;
	private String destination;
	private Date departureTime;
	private Date arrivalTime;
	private int availableSeats;
	
	public Flight(String flightNumber, String departure, String destination, Date departureTime, Date arrivalTime, int availableSeats) {
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.destination = destination;
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
	
	public String getDeparture() {
		return departure;
	}
	
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;

	}
	
	public Date getDepartureTime() {
		return departureTime;
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
	

	public void flightClass() {
		System.out.println("The flight has been engined");
		
	}
	abstract void calculateFare();
	
	public void displayFlight() {
		System.out.println(" --- Flight Details --- " );
		System.out.println("Flight Number: " + getFlightNumber());
		System.out.println("From: " + getDeparture());
		System.out.println("To: " + getDestination());
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
	}


class EconomyClass extends Flight {
	
	public EconomyClass(String flightNumber, String departure, String destination, Date departureTime, Date arrivalTime, int availableSeats) {
		super(flightNumber, departure, destination, departureTime, arrivalTime, availableSeats);
	}
	void calculateFare() {
			String destination = getDestination().trim();
			 double destinationFare = 0;

				switch(destination.toLowerCase()) {
				case "davao":
					destinationFare = 1500;
					break;
				case "Manila":
					destinationFare = 5950;
					break;
				case "Cagayan De Oro City":
					destinationFare = 3904;
					break;
				case "Cebu":
					destinationFare = 1750;
					break;
				case "Zamboanga":
					destinationFare = 1645;
					break;
				case "Clark":
					destinationFare = 6500;
					break;
				case "Bohol":
					destinationFare = 7390;
					break;
				case "Bacolod":
					destinationFare = 4345;
					break;
				case "Caticlan":
					destinationFare = 8632;
					break;
				case "IloIlo":
					destinationFare = 5236;
					break;
					default:
			            System.out.println("Invalid Choices");
			            destinationFare = 0;
				}
				if (destinationFare > 0) {
			    System.out.println("Total Fee of " + getDestination() + " is ₱ " + destinationFare);
				}
	}
}
		
	

	
class BusinessClass extends Flight {
	

	public BusinessClass(String flightNumber, String departure, String destination, Date departureTime, Date arrivalTime, int availableSeats) {
		super(flightNumber, departure, destination, departureTime, arrivalTime, availableSeats);
	}


	void calculateFare() {
			double destinationFare = 0;
			double businessFare;
			String destination = getDestination().trim();
			
			switch(destination.toLowerCase()) {
			case "davao":
				destinationFare = 1500;
				break;
			case "Manila":
				destinationFare = 5950;
				break;
			case "Cagayan De Oro City":
				destinationFare = 3904;
				break;
			case "Cebu":
				destinationFare = 1750;
				break;
			case "Zamboanga":
				destinationFare = 1645;
				break;
			case "Clark":
				destinationFare = 6500;
				break;
			case "Bohol":
				destinationFare = 7390;
				break;
			case "Bacolod":
				destinationFare = 4345;
				break;
			case "Caticlan":
				destinationFare = 8632;
				break;
			case "IloIlo":
				destinationFare = 5236;
				break;
				default:
		            System.out.println("Invalid Choices");
		            destinationFare = 0;
			}
			if (destinationFare > 0) {
			businessFare = destinationFare * 2.3;
			System.out.println("Total Fee of " + getDestination() + " is ₱ " + businessFare);
		}
	}
}










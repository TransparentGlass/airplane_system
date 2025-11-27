package com.airplane.FlightSystem.Booking;

import java.util.ArrayList;
import java.util.List;

import com.airplane.FlightSystem.Flight;

public abstract class Booking {
    protected List<Passenger> passenger;
    protected Flight bookedFlight;

    //Multiple people booking
    public Booking(List<Passenger> passenger, Flight bookedFlight) {
        this.passenger = passenger;
        this.bookedFlight = bookedFlight;
    }

    //single person booking
    public Booking(Passenger passenger, Flight bookedFlight) {
        this.passenger = new ArrayList<>(List.of(passenger));
        this.bookedFlight = bookedFlight;
    }

    //TODO: Impplement a method that cycles through multiple passengers in a booking and a single passenger and shows their status. 
    //TODO: Create a flowchart for the booking process.
    //TODO: Implement a show booking status method to show that the booking is confirmed or cancelled.

    public abstract void bookingFlight();
    public abstract void cancelBooking();
}

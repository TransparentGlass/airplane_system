package com.airplane.FlightSystem.Booking;

import java.util.ArrayList;
import java.util.List;

import com.airplane.FlightSystem.Flight;

public abstract class Booking {
    //TODO: Implement multiple people booking under one reservation.
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

    public abstract void bookingFlight();
    public abstract void cancelBooking();
}

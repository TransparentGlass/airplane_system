package com.airplane.FlightSystem.Booking;

import com.airplane.FlightSystem.Flight;

public class CancelledBooking extends Booking {

    public CancelledBooking(Passenger passenger, Flight bookedFlight) {
        super(passenger, bookedFlight);
    }

    //TODO: Implement a show booking status method to show that the booking is cancelled.
    @Override
    public void bookingFlight() {
        System.out.println("Booking not completed. Status: CANCELLED");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Already cancelled.");
    }
}
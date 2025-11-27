package com.airplane.FlightSystem.Booking;

import com.airplane.FlightSystem.Flight;

public class ConfirmedBooking extends Booking {

    public ConfirmedBooking(Passenger passenger, Flight bookedFlight) {
        super(passenger, bookedFlight);
    }

    @Override
    public void bookingFlight() {
        if (bookedFlight.reserveSeats(1)) {
            System.out.println("Booking Confirmed for " + passenger.getName());
        } else {
            System.out.println("Booking Failed. No seats.");
        }
    }

    @Override
    public void cancelBooking() {
        bookedFlight.setAvailableSeats(bookedFlight.getAvailableSeats() + 1);
        System.out.println("Booking Cancelled for " + passenger.getName());
    }
}
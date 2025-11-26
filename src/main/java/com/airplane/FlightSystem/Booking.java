package com.airplane.FlightSystem;
public abstract class Booking {
    //
    protected Passenger passenger;
    protected Flight bookedFlight;

    public Booking(Passenger passenger, Flight bookedFlight) {
        this.passenger = passenger;
        this.bookedFlight = bookedFlight;
    }

    public abstract void bookingFlight();
    public abstract void cancelBooking();
}

class ConfirmedBooking extends Booking {

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

class CancelledBooking extends Booking {

    public CancelledBooking(Passenger passenger, Flight bookedFlight) {
        super(passenger, bookedFlight);
    }

    @Override
    public void bookingFlight() {
        System.out.println("Booking not completed. Status: CANCELLED");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Already cancelled.");
    }
}

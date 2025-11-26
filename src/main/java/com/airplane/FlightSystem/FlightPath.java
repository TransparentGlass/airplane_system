package com.airplane.FlightSystem;

public class FlightPath {
    //TODO: Implement a precomputed table for distance calculation between two locations.
    private static final int[][] distanceTable = {
        // Example distances in kilometers
        // From\To | CityA | CityB | CityC
        /* CityA */ {   0,   500,  1000 },
        /* CityB */ { 500,     0,   700 },
        /* CityC */ {1000,   700,     0 }
    }; 
    // TODO: Implement a fare calculation method that uses the distance table.
    void calculateFare(int distance, double rate) {
			//TODO: implement fare calculation with Business class rates.
		}
	
}

package com.airplane.FlightSystem;

import java.util.HashMap;
import java.util.Map;

public class Fare {
    private static final double EARTH_RADIUS_KM = 6371.0;
    private static final  Map<String, double[]> FlightTable = new HashMap<>();
    
    static{
        FlightTable.put("Cebu", new double[]{10.3157, 123.8854});
        FlightTable.put("Manila", new double[]{14.5995, 120.9842});
        FlightTable.put("Davao", new double[]{7.1907, 125.4553});
        FlightTable.put("CDO", new double[]{8.4542, 124.6319});
    }

    
    // TODO: Implement a fare calculation method that uses the distance table.
    public int calculateFare(double distance, double rate) {
        
			//TODO: implement fare calculation with Business class rates.
            int fare = (int) Math.round(distance * rate);
            return fare;
    }

    public static double calculateDistance(double[] source_loc, double[] target_loc) {

            // Convert degrees to radians
        double lat1Rad = Math.toRadians(source_loc[0]);
        double lon1Rad = Math.toRadians(source_loc[1]);
        double lat2Rad = Math.toRadians(target_loc[0]);
        double lon2Rad = Math.toRadians(target_loc[1]);

        // Differences
        double deltaLat = lat2Rad - lat1Rad;
            double deltaLon = lon2Rad - lon1Rad;

        // Haversine formula
        double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2)
                + Math.cos(lat1Rad) * Math.cos(lat2Rad)
                * Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Distance
        return EARTH_RADIUS_KM * c;
    }

    public static double[] getLocationCoords(String Location){
        return FlightTable.get(Location);
    }
	
}

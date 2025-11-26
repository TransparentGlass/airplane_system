package com.airplane;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TestMain {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Flight> flightLists = new ArrayList<>();

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Manila"));
        sdf.setLenient(false);

        initializeFlights(sdf);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("=========================================");
            System.out.println("------Welcome to M.A.M.A Airlines------");
            System.out.println("=========================================");
            System.out.println("1. View Flights");
            System.out.println("2. Check Fare");
            System.out.println("3. Book a Seat");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    viewFlights();
                    break;
                case "2":
                    locationSelection();
                    break;
                case "3":
                    bookSeat();
                    break;
                case "4":
                    System.out.println("Goodbye and Thank you!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please Try Again");
            }
        }
        scanner.close(); // <-- close AFTER loop
    }

    private static void initializeFlights(SimpleDateFormat sdf) {
        if (flightLists.isEmpty()) {
            try {
                Date d1 = sdf.parse("2025-12-01 08:00");
                Date a1 = sdf.parse("2025-12-01 09:30");
                flightLists.add(new EconomyClass("MAMA12ABC", "Manila", "Cebu", d1, a1, 50));
                flightLists.add(new BusinessClass("MAMA34CDE", "Manila", "Davao", d1, a1, 10));
                flightLists.add(new EconomyClass("MAMA01CDE", "Manila", "Cagayan De Oro", d1, a1, 50));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void locationSelection() {
        System.out.println("\n--- Check Fare ---");
        while (true) {
            System.out.print("Enter Destination City Name (or type 'back'): ");
            String city = scanner.nextLine().trim();

            if (city.equalsIgnoreCase("back")) {
                return;
            }

            boolean found = false;
            for (Flight f : flightLists) {
                if (f.getDestination().equalsIgnoreCase(city)) {
                    f.calculateFare();
                    found = true;
                }
            }

            if (found) {
                break;
            } else {
                System.out.println("Invalid Selection. We do not fly to " + city);
            }
        }
    }

    public static void viewFlights() {
        System.out.println("\n--- Flight Schedule---");
        if (flightLists.isEmpty()) {
            System.out.println("No flights available");
        }
        for (Flight f : flightLists) {
            f.displayFlight();
            System.out.println("------------------------");
        }
    }

    public static void bookSeat() {
        System.out.print("Enter Destination to search for flights (e.g. Cebu): ");
        String dest = scanner.nextLine().trim();

        boolean found = false;
        for (Flight f : flightLists) {
            if (f.getDestination().equalsIgnoreCase(dest)) {
                found = true;
                System.out.println("\nFound Flight: " + f.getFlightNumber());
                f.displayFlight();
                System.out.print("Do you want to book this flight? (yes/no): ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.print("How many seats? ");
                    try {
                        int seats = Integer.parseInt(scanner.nextLine());
                        f.reserveSeats(seats);
                    } catch (Exception e) {
                        System.out.println("Invalid number");
                    }
                    return;
                }
            }
        }
        if (!found) {
            System.out.println("No flight found for destination " + dest);
        }
    }
}

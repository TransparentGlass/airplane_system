package CSCC20Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class FlightFileHandler {
	
	private static final String FILE_NAME = "flight.txt";
	private static final SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy HH:mm");
	
	public static void saveFlight(ArrayList<flight> flights) {
		try (FileWriter writer = new FileWriter(FILE_NAME)) {
			for (flight f : flights) {
				String type =  ( f instanceof EconomyClass) ? "Economy" : "Business";
				String depTime = sdf.format(f.getDepartureTime());
				String arrTime = sdf.format(f.getArrivalTime());
				
				String line = String.format("%s,%s,%s,%s,%s,%s,%d\n",
						type,
						f.getFlightNumber(),
						f.getDeparture(),
						f.getDestination(),
						depTime,
						arrTime,
						f.getAvailableSeats()
						);
				writer.write(line);

			}
			System.out.println("Data Successfully saved to " + FILE_NAME);
		} catch (IOException e) {
			System.out.println("Error Saving File: " + e.getMessage());
		}
	}
	//Load Method 
	public static ArrayList<flight> loadFlights() {
		ArrayList<flight> loadedList = new ArrayList<>();
		File file = new File(FILE_NAME);
		if (!file.exists()) {
			System.out.println("No save file found. Starting new.");
			return loadedList; //Return Empty List
		}
		try (Scanner fileScanenr = new Scanner(file)) {
			while (fileScanenr.hasNextLine()) {
				String line = fileScanenr.nextLine();
				String[] data = line.split(",");
				
				if (data.length == 7) {
					String type = data[0];
					String id =  data[1];
					String dep = data[2];
					String dest = data[3];
					Date depTime = sdf.parse(data[4]);
					Date arrTime = sdf.parse(data[5]);
					int seats = Integer.parseInt(data[6]);
					
					flight f;
					if (type.equals("Economy")) {
						f = new EconomyClass(id, dep, dest, depTime, arrTime, seats);
					} else {
						f = new BusinessClass(id, dep, dest, depTime, arrTime, seats);
					}
					loadedList.add(f);
				}
			}
			System.out.println(" Data loaded successfully!");
		} catch (FileNotFoundException | ParseException e) {
			System.out.println(" Error loading file: " + e.getMessage());
			e.printStackTrace();
		}
		
		return loadedList;
		
	}
}

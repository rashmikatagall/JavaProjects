package com.detail.flight.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.detail.flight.Flight;

public class FlightDetailReader {

	public List<Flight> getFlightDetails(File file) {

		List<Flight> flights = new ArrayList<>();
		BufferedReader fos = null;
		try {
			fos = new BufferedReader(new FileReader(file));
			fos.readLine();
			String line;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			while ((line = fos.readLine()) != null) {

				String[] details = line.split("\\|");
				Flight flight = new Flight(details[0], details[1], details[2], LocalDate.parse(details[3], formatter),
						Integer.parseInt(details[4]), Double.parseDouble(details[5]), Double.parseDouble(details[6]));
				flights.add(flight);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flights;
	}
}

package com.detail.flight.service;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.detail.flight.Flight;

public class FlightService {

	private FlightDetailReader reader;

	public FlightService(FlightDetailReader reader) {
		this.reader = reader;
	}
	
	public List<Flight> getFlightDetails(String[] filenames)
	{
		List<Flight> flights = new ArrayList<>();
		System.out.println("Started processing at :" +LocalTime.now());
		
		for(String file : filenames)
		{
			flights.addAll(reader.getFlightDetails(new File(file)));
		}
		System.out.println("Completed processing at :" +LocalTime.now());
		return flights;
	}
	
	
	public void getFlightsByDepartLoc(String departLoc){
	
		String[] s = {"FileA.csv","FileB.csv","FileC.csv"};
		List<Flight> flights = getFlightDetails(s);
		
		
		flights.stream()
		       .filter(f -> f.getDepartLoc().equals(departLoc))
		       .sorted((f1,f2) -> f1.getFlightNum().compareTo(f2.getFlightNum()))
		       .map(f -> f.toString())
		       .forEach(System.out::println);
	}
	
    public void getFlightsByArrivalLoc(String arrivalLoc){
	
		
    	String[] s = {"FileA.csv","FileB.csv","FileC.csv"};
		List<Flight> flights = getFlightDetails(s);
		
		flights.stream()
		       .filter(f -> f.getArrivalLoc().equals(arrivalLoc))
		       .sorted((f1,f2) -> f1.getFlightNum().compareTo(f2.getFlightNum()))
		       .map(f -> f.toString())
		       .forEach(System.out::println);
	}
	
     public void getFlightsByFlightDate(String sdate){
	
		
    	String[] s = {"FileA.csv","FileB.csv","FileC.csv"};
 		List<Flight> flights = getFlightDetails(s);
		LocalDate date = LocalDate.parse(sdate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		flights.stream()
		       .filter(f -> f.getValidTill().equals(date))
		       .sorted((f1,f2) -> f1.getFlightNum().compareTo(f2.getFlightNum()))
		       .map(f -> f.toString())
		       .forEach(System.out::println);
	}
	
	
	public static void main(String[] args)
	{
		
		
		FlightService service = new FlightService(new FlightDetailReader());
		System.out.println("By Depart Location");
		service.getFlightsByDepartLoc("DEL");
		System.out.println("By Arrival Location");
		service.getFlightsByArrivalLoc("AMS");
		System.out.println("By Flight Date");
		service.getFlightsByFlightDate("30-11-2010");
		
	}
	
	
}

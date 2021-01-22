package com.detail.flight;

import java.time.LocalDate;

public class Flight {
	
	private String flightNum;
	private String departLoc;
	private String arrivalLoc;
	private LocalDate validTill;
	private int flightTime;
	private double flightDuration;
	private double fare;
	
	
	public Flight(String flightNum, String departLoc, String arrivalLoc, LocalDate validTill, int flightTime,
			double flightDuration, double fare) {
		this.flightNum = flightNum;
		this.departLoc = departLoc;
		this.arrivalLoc = arrivalLoc;
		this.validTill = validTill;
		this.flightTime = flightTime;
		this.flightDuration = flightDuration;
		this.fare = fare;
	}


	public String getFlightNum() {
		return flightNum;
	}


	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}


	public String getDepartLoc() {
		return departLoc;
	}


	public void setDepartLoc(String departLoc) {
		this.departLoc = departLoc;
	}


	public String getArrivalLoc() {
		return arrivalLoc;
	}


	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}


	public LocalDate getValidTill() {
		return validTill;
	}


	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}


	public int getFlightTime() {
		return flightTime;
	}


	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}


	public double getFlightDuration() {
		return flightDuration;
	}


	public void setFlightDuration(double flightDuration) {
		this.flightDuration = flightDuration;
	}


	public double getFare() {
		return fare;
	}


	public void setFare(double fare) {
		this.fare = fare;
	}


	@Override
	public String toString() {
		return flightNum + "|" + departLoc + "|" + arrivalLoc
				+ "|" + validTill + "|" + flightTime + "|" + flightDuration
				+ "|" + fare ;
	}
	
	
	
	

}

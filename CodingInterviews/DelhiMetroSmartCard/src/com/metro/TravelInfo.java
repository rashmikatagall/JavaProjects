package com.metro;

public class TravelInfo {

	private Station source;
	private Station destination;
	private double fare;
	private double balance;
	
	public TravelInfo(Station source, Station destination, double fare, double balance) {
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.balance = balance;
	}

	public Station getSource() {
		return source;
	}

	public void setSource(Station source) {
		this.source = source;
	}

	public Station getDestination() {
		return destination;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}

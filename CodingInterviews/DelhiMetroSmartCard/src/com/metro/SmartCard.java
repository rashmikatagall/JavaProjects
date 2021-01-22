package com.metro;

public class SmartCard {

	private String user;
	private int number;
	private double balance;

	public SmartCard(String user, int number, double balance) {
		this.user = user;
		this.number = number;
		this.balance = balance;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

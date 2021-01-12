package com.rashmi.empserialize;

public class Person extends Employee {
	private String job;
	private Address address;
	
	public Person(int empid, String name, String job) {
		super(empid, name);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

}

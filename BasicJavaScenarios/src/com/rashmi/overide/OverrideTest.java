package com.rashmi.overide;

class Person{
	
	void display() {
		System.out.println("Person display called");
	}
	
	static void print() {
		System.out.println("Static print from person");
	}
}
class Employee extends Person
{
	@Override
	void display()
	{
		System.out.println("Employee display called");
	}
	

	static void print() {
		System.out.println("Static print from Employee");
	}
	
}

public class OverrideTest {
	
	public static void main(String[] args) {
		
		Person p = new Employee();
		p.display();
		p.print();
		Employee.print();
	}
	
	
	

}

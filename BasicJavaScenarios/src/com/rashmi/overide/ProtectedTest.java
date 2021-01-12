package com.rashmi.overide;

public class ProtectedTest {

	protected String pro = "Protected";
	String def = "Default";
	public String pub = "Public";
	
	protected void Protecteddisplay() {
		System.out.println("This is from protected method");
	}
	
	void defaultDisplay() {
		System.out.println("This is from default method");
	}
	
	public void publicDisplay()
	{
		System.out.println("This is from public method");
	}
}

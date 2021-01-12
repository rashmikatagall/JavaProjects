package com.rashmi.accessmodifier;

import com.rashmi.overide.ProtectedTest;

public class AccessTest extends ProtectedTest{
	
	public void displayAllProtected() {
		System.out.println("String : " + this.pro);
		this.Protecteddisplay();
	}

}

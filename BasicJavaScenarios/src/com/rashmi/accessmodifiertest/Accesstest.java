package com.rashmi.accessmodifiertest;

import com.rashmi.accessmodifier.AccessTest;
import com.rashmi.overide.ProtectedTest;

public class Accesstest {

	public static void main(String[] args) {
		
		AccessTest at = new AccessTest();
		at.displayAllProtected();
		
		ProtectedTest pt = new ProtectedTest();
		pt.publicDisplay();
	

	}

}

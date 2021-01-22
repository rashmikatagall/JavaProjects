package com.metro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.metro.exceptions.NoMinimumBalanceException;
import com.metro.repository.CurrentTravelRepositpory;

class SmartCardServiceImplTest {
	
	private SmartCardService service;
	
	@BeforeEach
	public void init() {
	     service = new SmartCardServiceImpl();
	}
	
	@Test
	public void testSwipeIn_throwsNoMinimumBalanceException() {
		SmartCard card = new SmartCard("Rashmi", 123, 20);
		System.out.println("The balance on card is :" +card.getBalance());
		
		assertThrows(NoMinimumBalanceException.class, () -> service.swipein(card, Station.A1));
	}
	
	@Test
	public void testSwipeIn_success() {
		SmartCard card = new SmartCard("Rashmi", 123, 50);
		System.out.println("The balance on card is :" +card.getBalance());
		service.swipein(card, Station.A2);
		
		CurrentTravelRepositpory ctr = CurrentTravelRepositpory.getCurrenTravelRepo();
		assertEquals(Station.A2.toString(), ctr.get(card).toString());
		
		
	}

}

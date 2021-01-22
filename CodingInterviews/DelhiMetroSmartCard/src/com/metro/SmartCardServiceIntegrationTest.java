package com.metro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartCardServiceIntegrationTest {

	@Test
	void test() {
		SmartCard card = new SmartCard("rashmi", 123, 100);
		SmartCardServiceImpl service = new SmartCardServiceImpl();
		service.swipein(card, Station.A1);
		service.swipeout(card, Station.A3);
		service.swipein(card, Station.A4);
		service.swipeout(card, Station.A5);
		service.perCardReport(card);
	}

}

package com.metro;

public interface SmartCardService {
	
	public void swipein(SmartCard card, Station station);
    public void swipeout(SmartCard card, Station station);
}

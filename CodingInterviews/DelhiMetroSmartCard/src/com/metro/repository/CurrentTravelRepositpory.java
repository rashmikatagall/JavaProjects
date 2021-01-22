package com.metro.repository;

import java.util.HashMap;
import java.util.Map;

import com.metro.SmartCard;
import com.metro.Station;

public class CurrentTravelRepositpory {
	
	private Map<SmartCard,Station> repo;

	private static CurrentTravelRepositpory currentTravelRepo;
	
	private CurrentTravelRepositpory() 
	{
		repo = new HashMap<>();
	}
	
	public static CurrentTravelRepositpory getCurrenTravelRepo() {
		
		if(currentTravelRepo == null)
			currentTravelRepo = new CurrentTravelRepositpory();
		
		return currentTravelRepo;
			
	}

	public void add(SmartCard card, Station station) {
		
		repo.put(card, station);
		
	}

	public Station get(SmartCard card) {
		
		return repo.get(card);
	}

	public void remove(SmartCard card) {
		
		repo.remove(card);
		
	}

}

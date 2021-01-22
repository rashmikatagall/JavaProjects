package com.metro.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.metro.SmartCard;
import com.metro.TravelInfo;

public class CardTravelHistory {

	private Map<SmartCard,List<TravelInfo>> cardTravelHistory;
	private static CardTravelHistory cardTravelHistoryRepo ;
	
	private CardTravelHistory() {
		cardTravelHistory = new HashMap<>();
	}
	
	public static CardTravelHistory getcardTravelHistoryRepo() {
		if(cardTravelHistoryRepo == null)
			cardTravelHistoryRepo = new CardTravelHistory();
		
		return cardTravelHistoryRepo;
	}

	public List<TravelInfo> get(SmartCard card) {
	
	    return cardTravelHistory.getOrDefault(card, new ArrayList<TravelInfo>());
	}

	public void add(SmartCard card, List<TravelInfo> travelList) {
	
		cardTravelHistory.put(card,travelList);
		
	}

	public void remove(SmartCard card) {
		 cardTravelHistory.remove(card);
		
	}
}

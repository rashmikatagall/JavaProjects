package com.metro;

import java.util.List;

import com.metro.exceptions.InsufficientBalanceException;
import com.metro.exceptions.NoMinimumBalanceException;
import com.metro.fareStrategy.FareStrategy;
import com.metro.fareStrategy.FareStrategyBuilder;
import com.metro.repository.CardTravelHistory;
import com.metro.repository.CurrentTravelRepositpory;

public class SmartCardServiceImpl implements SmartCardService {

	CurrentTravelRepositpory crRepo = CurrentTravelRepositpory.getCurrenTravelRepo();
	FareStrategy fareStrategy = FareStrategyBuilder.build();
	CardTravelHistory cardTravelHistoryRepo = CardTravelHistory.getcardTravelHistoryRepo();

	@Override
	public void swipein(SmartCard card, Station source) {

		if (card.getBalance() < 50)
			throw new NoMinimumBalanceException("Balance on the card is less than Rs.50");

		crRepo.add(card, source);

	}

	@Override
	public void swipeout(SmartCard card, Station destination) {

		Station source = crRepo.get(card);
		int noStations = Math.abs(destination.ordinal() - source.ordinal());
		double fare = fareStrategy.getfare() * noStations;
		if (card.getBalance() < fare)
			throw new InsufficientBalanceException("Card does not have sufficient balance for travel");

		double balance = card.getBalance() - fare;
		TravelInfo info = new TravelInfo(source, destination, fare, balance);
		List<TravelInfo> travelList = cardTravelHistoryRepo.get(card);
		cardTravelHistoryRepo.remove(card);
		
		
		card.setBalance(balance);
		travelList.add(info);
		cardTravelHistoryRepo.add(card, travelList);
		crRepo.remove(card);
	}

	public void perCardReport(SmartCard card) {

		List<TravelInfo> list = cardTravelHistoryRepo.get(card);
		list.stream().forEach(t -> System.out.println("From source :" + t.getSource() + " to destination : "
				+ t.getDestination() + ". Fare is :" + t.getFare() + " Balance on card is: " + t.getBalance()));

	}

}

package com.metro.fareStrategy;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FareStrategyBuilder {
	
	public static FareStrategy build() {
		
		DayOfWeek day = LocalDate.now().getDayOfWeek();
		if(day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)
			return new FareStrategyWeekend();
		else
			return new FareStrategyWeekday();
	}

}

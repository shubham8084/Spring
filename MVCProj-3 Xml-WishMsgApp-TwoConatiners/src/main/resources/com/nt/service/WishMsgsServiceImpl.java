package com.nt.service;

import java.util.Calendar;

public class WishMsgsServiceImpl implements WishMsgService {

	@Override
	public String getwishmsg() {
		var hour = 0;
		var calender = Calendar.getInstance();

		// get hour on day
		hour = calender.get(Calendar.HOUR_OF_DAY);

		// b.loic to generate msg
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good AfterNoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

}

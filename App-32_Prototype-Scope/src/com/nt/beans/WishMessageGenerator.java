package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	
	//varible declartion
	private Date date;

//generate setter method
	public void setDate(Date date) {
		this.date = date;
	}

//B.method use the injected Date class obj
	public String wishmsg(String user) {
	System.out.println("WishMessageGenerator.wishmsg()");
		int hour = 0;
		// get hour
		hour = date.getHours();
		// b.logic
		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good AfterNoon::" + user;
		else if (hour < 20)
			return "Good Evening::" + user;
		else
			return "Good Night::" + user;

	}

}

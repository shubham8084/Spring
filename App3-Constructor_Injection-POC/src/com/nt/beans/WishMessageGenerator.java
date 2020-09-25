package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
//declared varibles
	private Date date;
    private Date year;
	
public void setDate(Date date) {
		this.date = date;
	}



public void setYear(Date year) {
	this.year = year;
}

public int year() {
return date.getYear();
	
}


public WishMessageGenerator() {
	
	this.date = date;
}



public WishMessageGenerator(Date date) {
	super();
	this.date = date;
}
	


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

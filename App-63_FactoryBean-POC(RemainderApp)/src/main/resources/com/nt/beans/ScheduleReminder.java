package com.nt.beans;

import java.time.LocalDate;

public class ScheduleReminder {
private LocalDate localdate=null;

public ScheduleReminder(LocalDate localdate) {
	
	this.localdate = localdate;
}

public String getReminder() {
	LocalDate sysDate=null;
	//get currnet date
	sysDate=LocalDate.now();
	//b.logic 
	if(sysDate.isEqual(localdate))
		return "Reminder for attending board metting";
		else
			return "No metting today relax !!!";
}

	
	
	
}

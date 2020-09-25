package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.DateFactoryBean;
import com.nt.beans.ScheduleReminder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		DateFactoryBean date = null;
		ScheduleReminder reminder = null;
		// get IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

        //taget bean
		reminder = ctx.getBean("reminder", ScheduleReminder.class);
		// class reminder method
		System.out.println("Reminder message:::"+reminder.getReminder());

		// close cotainer
		((AbstractApplicationContext) ctx).close();

	}

}

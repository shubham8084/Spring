package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Voter implements InitializingBean, DisposableBean {
	private String name;
	private float age;
	private Date dov;

	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Voter.afterPropertiesSet()");
		// TODO Auto-generated method stub
		
		dov = new Date(); // initializing left over properties
		boolean flag = false;
		if (name == null) { // validation logic
			System.out.println(" name must not be null");
			flag = true;
		}

		if (age < 0)
			age = age * -1; // correcting the values //Bean post processing

		if (age > 100) { // validation logic
			System.out.println(" age must not >100");
			flag = true;
		}
		if (flag)
			throw new IllegalArgumentException(" invalid inputs");



	}// method

	
	// b.logic
	public String CheckVotingEligiblity() {
		System.out.println("Voter.CheckVotingEligiblity()");
		dov = new Date();
		
		if (age > 18)
			return "Mr/Mis " + name + "You r eligible for voitng your Age-->" + age + " on--> " + dov;
		else
			return "Mr/Mis " + name + "You r not eligible for voitng your Age-->" + age + "on--> "+ dov;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Voter.destroy()");
		// TODO Auto-generated method stub
		// nullify bean properties
				name = null;
				age = 0;
				dov = null;
	}

	
}

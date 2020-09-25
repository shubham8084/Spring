package com.nt.beans;

import java.util.Date;

import lombok.Data;

@Data
public class Voter {
	private String name;
	private float age;
	private Date dov;

	public void myInit() {
		System.out.println("Voter.myInit()");
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

	}

	// destroy life cycle method/custom destroy method
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		// nullify bean properties
		name = null;
		age = 0;
		dov = null;
	}

	// b.logic
	public String CheckVotingEligiblity() {
		dov = new Date();
		System.out.println("Voter.CheckVotingEligiblity()");
		if (age > 18)
			return "Mr/Mis " + name + "You r eligible for voitng your Age-->" + age + " on--> " + dov;
		else
			return "Mr/Mis " + name + "You r not eligible for voitng your Age-->" + age + "on--> "+ dov;
	}// method

}

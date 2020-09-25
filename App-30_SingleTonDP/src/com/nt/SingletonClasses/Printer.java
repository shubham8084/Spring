package com.nt.SingletonClasses;

public class Printer {
private static Printer INSTANCE;
	
	
	private Printer(){
		System.out.println("Printer():: 0-param Constructor");
	}
	//Static Method
	public static Printer getInstance() {
		if(INSTANCE==null) 
			INSTANCE=new Printer();
			return INSTANCE;
	}
	//B.logic 
	public void getData(String msg) {
		System.out.println(msg);
	}
	
}//class

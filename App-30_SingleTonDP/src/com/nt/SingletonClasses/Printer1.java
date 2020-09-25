package com.nt.SingletonClasses;

public enum Printer1 {
    INSTANCE;
	
	
	private Printer1(){
		System.out.println("Printer():: 0-param Constructor");
	}
	
	//B.logic 
	public void getData(String msg) {
		System.out.println(msg);
	}
	
}//class

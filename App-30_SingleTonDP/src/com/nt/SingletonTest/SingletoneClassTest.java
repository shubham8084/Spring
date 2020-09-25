package com.nt.SingletonTest;

import com.nt.SingletonClasses.Printer;

public class SingletoneClassTest {
 public static void main(String[] args) {
	Printer p1=null;
	String msg = null;
	p1=Printer.getInstance();

	System.out.println(p1.hashCode()+" "+p1.getClass()+" "+p1.toString()+" "+p1.getClass().getName());
	
	
	//calls B.logic 
p1.getData("This Is Single Ton Java Class Using Static Block");
	
}
	
	
}

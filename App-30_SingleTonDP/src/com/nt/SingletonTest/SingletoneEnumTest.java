package com.nt.SingletonTest;

import com.nt.SingletonClasses.Printer1;

public class SingletoneEnumTest {
 public static void main(String[] args) {
	Printer1 p1= Printer1.INSTANCE;
	
	System.out.println(p1.hashCode()+" "+p1.getClass()+" "+p1.toString()+" "+p1.getClass().getName());
	
	
	//calls B.logic 
p1.getData("This Is Single Ton Java Class Using Static Block");
	
}
	
	
}

package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.EcomExp;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstant(String couriername) {
		//declaried variable
		Courier courier=null;
		Flipkart fpkt=null;
		//create courier service obj
		if(couriername.equalsIgnoreCase("DTDC"))
			courier=new DTDC();
		else if(couriername.equalsIgnoreCase("BlueDart"))
			courier=new BlueDart();
		else if(couriername.equalsIgnoreCase("EcomExp"))
			courier=new EcomExp();
		else
			throw new  IllegalArgumentException(" Invalid courier name");
		
		
		//create target class
		fpkt=new Flipkart();
		//asssign dependent class
		fpkt.setCourier(courier);
		return fpkt;
	}
	
	
}

package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;


	public void setCourier(Courier courier) {
		this.courier = courier;
	}


	public String getInstant(String[] item, float[] price) {
		// Variable decleartion
		float BillAmt = 0.0f;
		String msg = null;
		int oid = 0;
		Random ran = null;

		// calculate price
		for (float p : price) {

			BillAmt = BillAmt + p;
		}

		//generate oid Random number
		ran= new Random();
		oid=ran.nextInt(10000);
		
		//use courier servuce for delivaring prodcuts
		msg=courier.deliver(oid);
		
		//return bill details and product info to costomer
		return Arrays.toString(item)+" having price "+ Arrays.toString(price)+ " total BillAmount "+ BillAmt+"....."+msg;
				
	}

}

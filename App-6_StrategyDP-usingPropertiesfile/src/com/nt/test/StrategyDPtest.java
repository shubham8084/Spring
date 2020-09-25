package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPtest {

	public static void main(String[] args) {
		
		Flipkart fpkt=null;
		fpkt=FlipkartFactory.getInstant();
		System.out.println(fpkt.getInstant(new String[] {"Tv","Refrigetor","WashingMachine"}, new float[] {25000,15000,20000}));
				
	}

}

package com.nt.target;

import java.util.Random;

public class BankLoanManagement {

	public float calculateCompoundiIntrest(float pAmt,float rate,float time) {
		System.out.println("BankLoanManagement.calculateCompoundiIntrest()");
		return (float) ((pAmt*Math.pow((1+rate/100),time))-pAmt);
		
	}
	
	public int balview() {
		
		return new Random().nextInt(100000);
	}
	
	
}//class

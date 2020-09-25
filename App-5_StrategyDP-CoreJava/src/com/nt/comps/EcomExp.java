package com.nt.comps;

public class EcomExp implements Courier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "Product with order id " +oid+ " Deliverd by EcomExp";
	}

}

package com.nt.comp;

public class LuxoryCar implements Car {
 private Tyres tyre;
 
	public void setTyre(Tyres tyre) {
	this.tyre = tyre;
}
	


	public LuxoryCar(Tyres tyre) {
		super();
		this.tyre = tyre;
	}



	@Override
	public void drive() {
		System.out.println("Driving Luxory Car having "+tyre.roadGrip());
	}

}

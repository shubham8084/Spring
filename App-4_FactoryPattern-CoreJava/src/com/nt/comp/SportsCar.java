package com.nt.comp;

public class SportsCar implements Car {
	private Tyres tyre;

	

	public SportsCar(Tyres tyre) {
		super();
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("Driving Sports Car having " + tyre.roadGrip());

	}

	public void setTyre(Tyres tyre) {
		this.tyre = tyre;
	}

}
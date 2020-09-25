package com.nt.comp;

public class BudgetCar implements Car {
private Tyres tyre;

	
	public void setTyre(Tyres tyre) {
	this.tyre = tyre;
}

	

	public BudgetCar(Tyres tyre) {
		super();
		this.tyre = tyre;
	}



	@Override
	public void drive() {
	 System.out.println("Driving Budget car having "+tyre.roadGrip());
	}

}

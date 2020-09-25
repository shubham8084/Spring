package com.nt.factory;

import com.nt.comp.ApolloTyre;
import com.nt.comp.BudgetCar;
import com.nt.comp.CEATTyre;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.MRFTyre;
import com.nt.comp.SportsCar;
import com.nt.comp.Tyres;

public class CarFactory {
 
	public static Car getInstance(String carname) {
		Tyres tyre=null;
		Car car=null;
		if(carname.equalsIgnoreCase("luxorycar"))
		{
			tyre=new CEATTyre();
			car=new LuxoryCar(tyre);
		}//if
		else if(carname.equalsIgnoreCase("budgetcar"))
		{
			tyre=new ApolloTyre();
			car=new BudgetCar(tyre);
		}//else if
		else if(carname.equalsIgnoreCase("sportcar"))
		{
			tyre=new MRFTyre();
			car=new SportsCar(tyre);
		}//else if
		else {
			throw new IllegalArgumentException("Invalid Car type");
			
		}//else
		
		return car;
	}//static
	
	
	
	
	
}

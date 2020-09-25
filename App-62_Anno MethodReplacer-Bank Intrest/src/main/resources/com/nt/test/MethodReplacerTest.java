package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.BankLoanManagement;

public class MethodReplacerTest {

	public static void main(String[] args) {
	ApplicationContext ctx=null;
	BankLoanManagement bank=null;
	//get IOC conatiner
	ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
	//get bean instantion
	bank=ctx.getBean("bank",BankLoanManagement.class);
	
	//invoke compunt intrest methdo
	System.out.println("Interest::"+bank.calculateCompoundiIntrest(10000, 5, 1));
	System.out.println("Avl Balance::"+bank.balview());

	
	//close container
   ((AbstractApplicationContext) ctx).close();
	}//main

}//class

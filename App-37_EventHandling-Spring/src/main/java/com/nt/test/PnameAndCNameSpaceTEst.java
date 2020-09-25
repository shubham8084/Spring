package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.entity.Employee;

public class PnameAndCNameSpaceTEst {

	public static void main(String[] args) {
	
		ApplicationContext ctx=null;
		Employee Emp=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		
		Emp=ctx.getBean("emp", Employee.class);
		System.out.println(Emp);
		

	}

}

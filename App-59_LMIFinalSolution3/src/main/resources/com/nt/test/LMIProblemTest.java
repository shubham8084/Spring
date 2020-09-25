package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMIProblemTest {

	public static void main(String[] args) {
	 ApplicationContext ctx=null;
	 WebContainer wc=null;
	 //get container
	 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

	 //get target classs
	 wc=ctx.getBean("container",WebContainer.class);
	 wc.processRequest("table");
	System.out.println("-------------------");
	wc.processRequest("chair");
	System.out.println("-------------------");
	wc.processRequest("sofa"); 
	
	 //close conatiner
	 ((AbstractApplicationContext) ctx).close();
	}

}

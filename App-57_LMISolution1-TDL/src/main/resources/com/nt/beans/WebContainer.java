package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
 private String beaniId;
 
 //setter
 public void setBeaniId(String beaniId) {
	this.beaniId = beaniId;
}


//constructor
public WebContainer() {
	System.out.println("WebContainer::0-param");
}//constructor
 
 
 
 public void processRequest(String data) {
	 ApplicationContext ctx=null;
	 RequestHandler handler=null;
	 //get extra IOC conatiner
	 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	 
	 //get dependent bean obje using lookup method
	 handler=ctx.getBean(beaniId,RequestHandler.class);
	 
	handler.HandleRequest(data);
	
 }
 
}//class

package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware {
 private String beaniId;
 private ApplicationContext ctx=null;
 
 //setter
 public void setBeaniId(String beaniId) {
	this.beaniId = beaniId;
}

public void setApplicationContext(ApplicationContext ctx) throws BeansException {
	System.out.println("WebContainer.setApplicationContext()");
	this.ctx = ctx;
}

//constructor
public WebContainer() {
	System.out.println("WebContainer::0-param");
}//constructor
 
 
 
 public void processRequest(String data) {
	
	 RequestHandler handler=null;
	
	 //get dependent bean obje using lookup method
	 handler=ctx.getBean(beaniId,RequestHandler.class);
	 
	handler.HandleRequest(data);
	
 }
 
}//class

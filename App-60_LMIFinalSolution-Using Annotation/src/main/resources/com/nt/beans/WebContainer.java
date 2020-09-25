package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("container")
@Scope("singleton")
public abstract class WebContainer{


//constructor
public WebContainer() {
	System.out.println("WebContainer:: 0-param constructor ::"+this.getClass()+"......."+this.getClass().getSuperclass());
}//constructor
@Lookup("handler") 
public abstract    RequestHandler  createRequestHandler();
 
 public void processRequest(String data) {
	
	 RequestHandler handler=null;
	
	 //get dependent bean obje using lookup method
	 handler=createRequestHandler();
	handler.handleRequest(data);
	
 }
 
}//class

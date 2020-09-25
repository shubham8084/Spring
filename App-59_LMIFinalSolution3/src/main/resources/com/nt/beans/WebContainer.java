package com.nt.beans;

public abstract class WebContainer{


//constructor
public WebContainer() {
	System.out.println("WebContainer:: 0-param constructor ::"+this.getClass()+"......."+this.getClass().getSuperclass());
}//constructor
 
public abstract    RequestHandler  createRequestHandler();
 
 public void processRequest(String data) {
	
	 RequestHandler handler=null;
	
	 //get dependent bean obje using lookup method
	 handler=createRequestHandler();
	handler.HandleRequest(data);
	
 }
 
}//class

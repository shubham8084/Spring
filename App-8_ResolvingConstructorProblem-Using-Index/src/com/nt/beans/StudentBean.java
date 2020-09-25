package com.nt.beans;

public class StudentBean {

	private int sno;
	private String sname;
	private float marks;

	public StudentBean(int sno, String sname, float marks) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.marks = marks;
	}
	
	  
	  @Override public String toString() { return "StudentBean [sno=" + sno +
	  ", sname=" + sname + ", marks=" + marks + "]"; }
	  
	 

}

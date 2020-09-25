package com.nt.entity;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Employee {

	private int eno;
	private String ename;
	private Date dob;
	private Department dept;

	
	
}

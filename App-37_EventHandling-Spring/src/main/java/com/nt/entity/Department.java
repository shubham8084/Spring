package com.nt.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@AllArgsConstructor
public class Department {

	private int dno;
	private String dname;
	private Date dos;
	
	
	
}

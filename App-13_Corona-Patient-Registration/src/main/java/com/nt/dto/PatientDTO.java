package com.nt.dto;

public class PatientDTO {
	
	private String Name;
	private int Age;
	private String Address;
private String Report ;
private long Mobile;
private String Email;

//generate getter and setter
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getReport() {
	return Report;
}
public void setReport(String report) {
	Report = report;
}
public long getMobile() {
	return Mobile;
}
public void setMobile(long mobile) {
	Mobile = mobile;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}

}

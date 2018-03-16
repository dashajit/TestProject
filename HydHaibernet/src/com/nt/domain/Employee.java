package com.nt.domain;

public class Employee {
	private int Eid;
	private String Fname;
	private String Lname;
	private String Email;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email + "]";
	}
	
	
	
	

}

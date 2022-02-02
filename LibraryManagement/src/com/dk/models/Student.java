package com.dk.models;

public class Student extends Member{

	int roll;
	String branch;
	public Student(int memid, String name, boolean active, int noOfBooks, int roll, String branch) {
		super(memid, name, active, noOfBooks);
		this.roll = roll;
		this.branch = branch;
	}
	public Student(int memid, String name, boolean active, int noOfBooks) {
		super(memid, name, active, noOfBooks);
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}

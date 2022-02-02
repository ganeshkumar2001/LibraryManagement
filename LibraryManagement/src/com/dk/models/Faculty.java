package com.dk.models;

public class Faculty extends Member {

	 int facid;
	 String designation;
	public Faculty(int memid, String name, boolean active, int noOfBooks, int facid, String designation) {
		super(memid, name, active, noOfBooks);
		this.facid = facid;
		this.designation = designation;
	}
	public Faculty(int memid, String name, boolean active, int noOfBooks) {
		super(memid, name, active, noOfBooks);
	}
	public int getFacid() {
		return facid;
	}
	public void setFacid(int facid) {
		this.facid = facid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	 
}

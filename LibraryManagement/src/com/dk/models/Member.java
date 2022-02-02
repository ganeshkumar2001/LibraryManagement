package com.dk.models;

abstract public class Member {

	int memid;
	String name;
	boolean active;
	int noOfBooks;
	
	public Member(int memid, String name, boolean active, int noOfBooks) {
		super();
		this.memid = memid;
		this.name = name;
		this.active = active;
		this.noOfBooks = noOfBooks;
	}

	public Member() {
		super();
	}

	public int getMemid() {
		return memid;
	}

	public void setMemid(int memid) {
		this.memid = memid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	
	
	
	
	
}

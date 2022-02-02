package com.dk.models;

import java.util.Date;

public class Records {

	int recordid;
	Item item;
	Member member;
	Date isDate;
	Date retDate;
	int fine;
	public Records(int recordid, Item item, Member member, Date isDate, Date retDate, int fine) {
		super();
		this.recordid = recordid;
		this.item = item;
		this.member = member;
		this.isDate = isDate;
		this.retDate = null;
		this.fine = 0;
	}
	public int getRecordid() {
		return recordid;
	}
	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Date getIsDate() {
		return isDate;
	}
	public void setIsDate(Date isDate) {
		this.isDate = isDate;
	}
	public Date getRetDate() {
		return retDate;
	}
	public void setRetDate(Date retDate) {
		this.retDate = retDate;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	
	
}

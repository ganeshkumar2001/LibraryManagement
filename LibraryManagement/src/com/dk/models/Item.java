package com.dk.models;

abstract public class Item {

	int itemid;
	String type;
	Records rec;
	public Item(int itemid, String type) {
		super();
		this.itemid = itemid;
		this.type = type;
		this.rec = null;
	}
	public Item() {
		super();
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Records getRec() {
		return rec;
	}
	public void setRec(Records rec) {
		this.rec = rec;
	}
	
	
	
}

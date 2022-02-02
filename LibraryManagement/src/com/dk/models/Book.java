package com.dk.models;

public class Book extends Item {

	int bookid;
	String title;
	String author;
	public Book(int itemid, String type, int bookid, String title, String author) {
		super(itemid, type);
		this.bookid = bookid;
		this.title = title;
		this.author = author;
	}
	public Book(int itemid, String type) {
		super(itemid, type);
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}

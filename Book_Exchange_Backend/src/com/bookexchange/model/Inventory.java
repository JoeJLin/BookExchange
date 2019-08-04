package com.bookexchange.model;

import java.util.HashMap;

public class Inventory {
	
	
	private HashMap<String, String> bookList = new HashMap<String, String>();
	
	
	public Inventory() {
		bookList.put("book 1", "12345678");
		bookList.put("book 2", "23456789");
		bookList.put("book 3", "34567890");
		bookList.put("book 4", "45678901");
	}


	public HashMap<String, String> getBookList() {
		return bookList;
	}


	public void setBookList(HashMap<String, String> bookList) {
		this.bookList = bookList;
	}
	
	
}

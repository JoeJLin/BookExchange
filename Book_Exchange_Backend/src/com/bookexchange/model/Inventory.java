package com.bookexchange.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
	
	//isbnList is easy to search isbn using book name
	private HashMap<String, String> isbnList = new HashMap<String, String>();
	List<Book> bookList = new ArrayList<Book>();
	

	public Inventory() {
		//hardcode to make a fake inventory
		this.initializeIsbnList();
	}


	private void initializeIsbnList() {
		//add new books to the inventory 
		this.addToInventory("book 1","12345678", "Author 1", 121.66);
		this.addToInventory("book 2","23456789", "Author 2", 221.66);
		this.addToInventory("book 3","34567890", "Author 3", 321.66);
		this.addToInventory("book 4","45678901", "Author 4", 421.66);
	}


	private void addToInventory(String name, String isbn, String authorName, double price) {
		
		// make a new book
		Book newBook = new Book(name,isbn,authorName,price);
		
		// add to isbnList so we can search isbn based on user input bookname
		isbnList.put(name,isbn);
		
		// add the new book to bookList(our inventory)
		bookList.add(newBook);
	}

	
	public HashMap<String, String> getIsbnList() {
		return isbnList;
	}


	public void setIsbnList(HashMap<String, String> isbnList) {
		this.isbnList = isbnList;
	}


	public List<Book> getBookList() {
		return bookList;
	}


	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}


	public String getISBN(String bookName) {
		return this.isbnList.get(bookName);
	}
	
}


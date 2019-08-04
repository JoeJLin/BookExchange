package com.bookexchange.model;

import java.text.DecimalFormat;

public class Book {

	private String bookName;
	private String ISBN;
	private double price;
	private String author;

	public Book(String bookName, String ISBN, String author, double price) {
		this.setBookName(bookName);
		this.setISBN(ISBN);
		this.setPrice(price);
		this.setAuthor(author);
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String name) {
		this.bookName = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

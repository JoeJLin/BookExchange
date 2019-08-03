package com.bookexchange;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

public class Item {

	@Autowired
	private Book theBook;

	@Autowired
	private User user;

	private String id;
	private LocalDateTime createdDate;
	private LocalDateTime lastUpdatedTime;

	public Book getTheBook() {
		return theBook;
	}

	public void setTheBook(Book theBook) {
		this.theBook = theBook;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

}

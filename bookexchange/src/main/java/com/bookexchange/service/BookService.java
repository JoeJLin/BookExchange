package com.bookexchange.service;

import java.util.List;

import com.bookexchange.model.Book;

public interface BookService {
	
	public List<Book> getAllBooks() throws Exception;

}

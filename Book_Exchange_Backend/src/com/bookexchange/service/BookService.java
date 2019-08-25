package com.bookexchange.service;

import java.util.List;

import com.bookexchange.model.Book;

public interface BookService {

	public List<Book> getAllBooks() throws Exception;
	public Book addBook(Book book) throws Exception;
	public Book updateBook(Book book) throws Exception;
	public Book deleteBook(Book book) throws Exception;
	
}

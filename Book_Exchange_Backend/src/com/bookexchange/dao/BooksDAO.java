package com.bookexchange.dao;

import java.util.List;

import com.bookexchange.model.Book;

public interface BooksDAO {

	public List<Book> getAllBooks() throws Exception;
	public Book addBook(Book book) throws Exception;
	public Book updateBook(Book book) throws Exception;
	public Book deleteBook(Book book) throws Exception;
	
}

package com.bookexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bookexchange.dao.BooksDAO;
import com.bookexchange.model.Book;

@Service(value="BookServiceImpl")
@Component
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BooksDAO booksDao;

	@Override
	public List<Book> getAllBooks() throws Exception {
		return booksDao.getAllBooks();
	}

	@Override
	public Book addBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book deleteBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.bookexchange.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookexchange.dao.BooksDAO;
import com.bookexchange.model.Book;

@Service(value = "BookService")
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BooksDAO bookDAO;

	@Override
	public List<Book> getAllBooks() throws Exception {
		// TODO Auto-generated method stub
		return this.bookDAO.getAllBooks();
	}

}

package com.bookexchange.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bookexchange.model.Book;
import com.bookexchange.service.BookService;

//@Controller
@RestController
//@RequestMapping(path="/demo")
public class Home {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/hi")
	public String homePage() {
		return "hello world";
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		try {
			return this.bookService.getAllBooks();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "not found");
		}
		
	}
}

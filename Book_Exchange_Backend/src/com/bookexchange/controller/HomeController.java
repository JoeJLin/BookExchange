package com.bookexchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookexchange.model.Book;
import com.bookexchange.model.Inventory;
import com.bookexchange.service.BookService;

@Controller
public class HomeController {
	
	@Autowired
	private BookService bookService;
	
//	@RequestMapping("/")
//	public String homePage(@ModelAttribute("inventory") Inventory theInventory){
//		return "HomePage";
//	}
	
	@GetMapping("/")
	public String homePage() {
		return "hello";
	}
	
	@GetMapping("/books/")
	public List<Book> getBooks() throws Exception {
		return this.bookService.getAllBooks();
	}
	
}

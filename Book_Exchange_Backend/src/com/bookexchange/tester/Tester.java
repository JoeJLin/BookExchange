package com.bookexchange.tester;

import com.bookexchange.model.Book;
import com.bookexchange.model.Item;
import com.bookexchange.model.User;
import com.bookexchange.service.ItemListService;

public class Tester {

	public static void main(String[] args) {

		User user = new User();
		user.setId("1234");
		user.setName("Joe Lin");

		Book book = new Book();
		book.setAuthor("Zi Wu");
		book.setISBN("bk123");
		book.setName("Java Programming");
		book.setPrice(100.00);

		Item item = new Item();
		item.setUser(user);
		item.setId("item123");
		item.setbook(book);
		try {
			ItemListService.addItemToList(item);
			ItemListService.showListItems();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

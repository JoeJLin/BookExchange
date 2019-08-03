package com.bookexchange;

import java.util.HashMap;
import java.util.Map;

public class ItemList {
	
	private static Map<String, Item> bookList = new HashMap<String, Item>();
	
	public void addItemToList(Item item) throws Exception {
		System.out.println("in add item to list");
		if(bookList.containsKey(item.getId())) {
			throw new Exception("Item already exists.");
		} else {
			bookList.put(item.getId(), item);
			System.out.println("inserting item into item list");
		}
	}
}


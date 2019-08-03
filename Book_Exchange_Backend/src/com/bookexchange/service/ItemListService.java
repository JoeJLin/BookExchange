package com.bookexchange.service;

import java.util.HashMap;
import java.util.Map;

import com.bookexchange.model.Item;

public class ItemListService {
	
	private static Map<String, Item> itemList = new HashMap<String, Item>();
	
	public static void addItemToList(Item item) throws Exception {
		System.out.println("in add item to list");
		if(itemList.containsKey(item.getId())) {
			throw new Exception("Item already exists.");
		} else {
			itemList.put(item.getId(), item);
			System.out.println("inserting item into item list");
		}
	}
	
	public static void showListItems() throws Exception {
		if(itemList.isEmpty()) {
			throw new Exception("The list is empty.");
		} else {
			for(Map.Entry<String, Item> entry : itemList.entrySet()) {
				System.out.println(entry.getKey() + "\t\t" + entry.getValue().getbook().getName());
			}
		}
	}
}


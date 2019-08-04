package com.bookexchange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookexchange.model.Inventory;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePage(@ModelAttribute("inventory") Inventory theInventory){
		return "HomePage";
	}
	
}

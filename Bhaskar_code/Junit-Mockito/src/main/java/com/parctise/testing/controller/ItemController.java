package com.parctise.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parctise.testing.model.Items;
import com.parctise.testing.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping("/dummyItem")
	public Items dummyItem() {
		
		return new Items(1,"Test",10,100);
	}
	
	
	@GetMapping("/dummyItemService")
	public Items dummyItemService() {
		return service.retrieveItem();
	}
	
	
	@GetMapping("/dummyItemServiceFromDatabase")
	public List<Items> dummyItemServiceFromDatabase() {
		return service.retrieveItemFromDataBase();
	}
}

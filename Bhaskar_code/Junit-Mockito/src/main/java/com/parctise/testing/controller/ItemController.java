package com.parctise.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parctise.testing.model.Items;

@RestController
public class ItemController {

	@GetMapping("/dummyItem")
	public Items dummyItem() {
		
		return new Items(1,"Test",10,100);
	}
}

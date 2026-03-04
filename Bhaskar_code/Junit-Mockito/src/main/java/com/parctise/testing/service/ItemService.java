package com.parctise.testing.service;

import org.springframework.stereotype.Service;

import com.parctise.testing.model.Items;

@Service
public class ItemService {

	public Items retrieveItem() {

		return new Items(1, "Test", 10, 100);
	}

}

package com.parctise.testing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parctise.testing.model.Items;
import com.parctise.testing.repo.ItemsRepository;

@Service
public class ItemService {

	@Autowired
	private ItemsRepository repository;

	public Items retrieveItem() {

		return new Items(1, "Test", 10, 100);
	}

	public List<Items> retrieveItemFromDataBase() {

		List<Items> data = repository.findAll();

		for (Items items : data) {
			items.setValue(items.getPrice() * items.getQunatity());
		}
		return data;
	}

}

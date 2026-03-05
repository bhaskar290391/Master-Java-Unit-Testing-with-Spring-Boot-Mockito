package com.parctise.testing.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import com.parctise.testing.model.Items;
import com.parctise.testing.repo.ItemsRepository;

@DataJpaTest
public class ItemRepositoryTest {

	@Autowired
	private ItemsRepository repository;
	
	@Test
	public void dataTest() {
		List<Items> all = repository.findAll();
		
		assertEquals(3, all.size());
	}
}

package com.parctise.testing.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.parctise.testing.model.Items;
import com.parctise.testing.repo.ItemsRepository;

@ExtendWith(MockitoExtension.class)
class ItemServiceMocks {

	@Mock
	private ItemsRepository repository;

	@InjectMocks
	private ItemService service;

	@Test
	void retrieveItemFromDataBase_basic() {

		when(repository.findAll())
				.thenReturn(Arrays.asList(new Items(1, "Test", 10, 10), new Items(2, "Test1", 20, 20)));

		List<Items> data = service.retrieveItemFromDataBase();
		System.out.println(data);
		assertEquals(100, data.get(0).getValue());
		assertEquals(400, data.get(1).getValue());
	}

}

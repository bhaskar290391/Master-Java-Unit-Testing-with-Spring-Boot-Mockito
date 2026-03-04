package com.parctise.testing.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.parctise.testing.model.Items;
import com.parctise.testing.service.ItemService;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

	@Autowired
	private MockMvc mockmvc;
	
	@MockitoBean
	private ItemService service;

	@Test
	public void helloWorldTest_basic() throws Exception {

		RequestBuilder request = MockMvcRequestBuilders.get("/dummyItem").accept(MediaType.APPLICATION_JSON);
		
		MvcResult andReturn = mockmvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"Test\",\"price\":10,\"qunatity\":100}"))
				.andReturn();

		//assertEquals("Hello-World", andReturn.getResponse().getContentAsString());

	}
	
	
	@Test
	public void ItemsTestBySevice() throws Exception {
		
		when(service.retrieveItem()).thenReturn(new Items(1, "Test", 10, 100));

		RequestBuilder request = MockMvcRequestBuilders.get("/dummyItemService").accept(MediaType.APPLICATION_JSON);
		
		MvcResult andReturn = mockmvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"Test\",\"price\":10,\"qunatity\":100}"))
				.andReturn();

		//assertEquals("Hello-World", andReturn.getResponse().getContentAsString());

	}
}

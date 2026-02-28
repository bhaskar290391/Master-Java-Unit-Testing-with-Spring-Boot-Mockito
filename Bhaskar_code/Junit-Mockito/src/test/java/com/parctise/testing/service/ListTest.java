package com.parctise.testing.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListTest {
	
	private List list=mock(List.class);

	@Test
	void list_basic() {
		when(list.size()).thenReturn(5);
		assertEquals(5, list.size());
	}
	
	
	@Test
	void list_returnMultipleValue() {
		when(list.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, list.size());
		assertEquals(10, list.size());
	}
	
	@Test
	void list_withParemeters() {
		when(list.get(0)).thenReturn("Bhaskar");
		assertEquals("Bhaskar", list.get(0));
		assertEquals(null, list.get(1));
	}
	
	@Test
	void list_withParemeters_GenericValue() {
		when(list.get(anyInt())).thenReturn("Bhaskar");
		assertEquals("Bhaskar", list.get(0));
		assertEquals("Bhaskar", list.get(1));
	}

}

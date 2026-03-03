package com.parctise.testing.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListTest {
	
	private List<String> list=mock(List.class);

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
	
	@Test
	void verify_basics() {
		String value1=list.get(0);
		String value2=list.get(1);
		
		verify(list).get(0);
		verify(list).get(1);
		verify(list,atLeast(1)).get(0);
		verify(list,atLeastOnce()).get(anyInt());
		verify(list,atMost(2)).get(anyInt());
		verify(list,never()).get(2);
	}
	
	@Test
	public void argumentCapture() {
		list.add("Bhaskar");
		ArgumentCaptor<String> captor= ArgumentCaptor.forClass(String.class);
		verify(list).add(captor.capture());
		
		assertEquals("Bhaskar", captor.getValue());
	}

}

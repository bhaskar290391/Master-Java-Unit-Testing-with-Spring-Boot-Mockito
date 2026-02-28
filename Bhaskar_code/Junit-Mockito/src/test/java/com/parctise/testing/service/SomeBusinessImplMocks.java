package com.parctise.testing.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.parctise.testing.data.SomeBusinessDataService;


@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMocks {
	
	@Mock
	private SomeBusinessDataService service;
	
	@InjectMocks
	private SomeBusinessImpl business;
	

	
	
	@Test
	void calculateSumByDataService_basic() {
		
		when(service.retriveAllData()).thenReturn(new int[]{1,2,3});
	
		assertEquals(6, business.calculateSumBySomeBusinessDataService());
	}
	
	@Test
	void calculateSumByDataService_empty() {
		when(service.retriveAllData()).thenReturn(new int[]{});
		
		assertEquals(0, business.calculateSumBySomeBusinessDataService());
	}
	
	@Test
	void calculateSumByDataService_singleValue() {
		when(service.retriveAllData()).thenReturn(new int[]{5});
		
		assertEquals(5, business.calculateSumBySomeBusinessDataService());
	}

}

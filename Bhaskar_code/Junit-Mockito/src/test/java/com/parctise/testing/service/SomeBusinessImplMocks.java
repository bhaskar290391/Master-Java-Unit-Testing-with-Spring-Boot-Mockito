package com.parctise.testing.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.parctise.testing.data.SomeBusinessDataService;



class SomeBusinessImplMocks {
	
	private SomeBusinessImpl business=new SomeBusinessImpl();
	private SomeBusinessDataService service= mock(SomeBusinessDataService.class);
	
	
	@BeforeEach
	public void initialize() {
		business.setSomeBusinessDataService(service);
	}
	
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

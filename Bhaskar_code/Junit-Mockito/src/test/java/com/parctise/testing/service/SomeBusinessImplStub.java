package com.parctise.testing.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.parctise.testing.data.SomeBusinessDataService;

class SomeDataServiceForBasic implements SomeBusinessDataService{

	@Override
	public int[] retriveAllData() {
		
		return new int[] {1,2,2};
	}
	
}

class SomeDataServiceForEmpty implements SomeBusinessDataService{

	@Override
	public int[] retriveAllData() {
		
		return new int[] {};
	}
	
}

class SomeDataServiceForSingleValue implements SomeBusinessDataService{

	@Override
	public int[] retriveAllData() {
		
		return new int[] {1};
	}
	
}

class SomeBusinessImplStub {

	@Test
	void calculateSumByDataService_basic() {
		
		SomeBusinessImpl business=new SomeBusinessImpl();
		business.setSomeBusinessDataService(new SomeDataServiceForBasic());
		int actual= business.calculateSumBySomeBusinessDataService();
		int expected=5;
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateSumByDataService_empty() {
		
		SomeBusinessImpl business=new SomeBusinessImpl();
		business.setSomeBusinessDataService(new SomeDataServiceForEmpty());
		int actual= business.calculateSumBySomeBusinessDataService();
		int expected=0;
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateSumByDataService_singleValue() {
		
		SomeBusinessImpl business=new SomeBusinessImpl();
		business.setSomeBusinessDataService(new SomeDataServiceForSingleValue());
		int actual= business.calculateSumBySomeBusinessDataService();
		int expected=1;
		assertEquals(expected, actual);
	}

}

package com.parctise.testing.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void calculateSum_basic() {
		int[] data = {1,2,4};
		SomeBusinessImpl business=new SomeBusinessImpl();
		int actual= business.calculateSum(data);
		int expected=7;
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateSum_empty() {
		int[] data = {};
		SomeBusinessImpl business=new SomeBusinessImpl();
		int actual= business.calculateSum(data);
		int expected=0;
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateSum_singleValue() {
		int[] data = {1};
		SomeBusinessImpl business=new SomeBusinessImpl();
		int actual= business.calculateSum(data);
		int expected=1;
		assertEquals(expected, actual);
	}

}

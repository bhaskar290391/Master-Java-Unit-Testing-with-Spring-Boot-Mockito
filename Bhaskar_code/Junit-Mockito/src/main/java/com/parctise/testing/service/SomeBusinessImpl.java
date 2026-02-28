package com.parctise.testing.service;

public class SomeBusinessImpl {

	public int calculateSum(int[]  datas ) {
		
		int sum=0;
		for (int data : datas) {
			sum += data;
		}
		
		return sum;
	}
}

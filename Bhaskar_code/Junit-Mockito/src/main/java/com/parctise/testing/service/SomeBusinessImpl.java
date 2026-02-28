package com.parctise.testing.service;

import com.parctise.testing.data.SomeBusinessDataService;

public class SomeBusinessImpl {

	private SomeBusinessDataService someBusinessDataService;

	public void setSomeBusinessDataService(SomeBusinessDataService someBusinessDataService) {
		this.someBusinessDataService = someBusinessDataService;
	}

	public int calculateSum(int[] datas) {

		int sum = 0;
		for (int data : datas) {
			sum += data;
		}

		return sum;
	}

	public int calculateSumBySomeBusinessDataService() {
		int[] datas = someBusinessDataService.retriveAllData();
		int sum = 0;
		for (int data : datas) {
			sum += data;
		}

		return sum;
	}
}

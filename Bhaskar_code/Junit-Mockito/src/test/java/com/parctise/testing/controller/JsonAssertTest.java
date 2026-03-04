package com.parctise.testing.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

	private String actualResponse = "{\"id\":1,\"name\":\"Test\",\"price\":10,\"qunatity\":100}";

	@Test
	public void JsonAssertTest_StrictTrue() throws JSONException {
		String expectedResponse = "{\"id\":1,\"name\":\"Test\",\"price\":10,\"qunatity\":100}";

		JSONAssert.assertEquals(expectedResponse, actualResponse, true);

	}

	@Test
	public void JsonAssertTest_StrictFalse() throws JSONException {
		String expectedResponse = "{\"id\":1,\"name\":\"Test\",\"price\":10}";

		JSONAssert.assertEquals(expectedResponse, actualResponse, false);

	}
	
	@Test
	public void JsonAssertTest_withoutEscapeCharcter() throws JSONException {
		String expectedResponse = "{id:1,name:Test,price:10}";

		JSONAssert.assertEquals(expectedResponse, actualResponse, false);

	}

}

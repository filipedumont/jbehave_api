package com.ac.bdd.todo.api.client;

import static com.jayway.restassured.RestAssured.get;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertFalse;

import java.util.Map;

import org.junit.Test;

import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.response.Response;

public class PhoneBookServiceClient {	

	private Response response;
	
	public void getContacts(){
		response = get("http://localhost:5000/contacts");
	}

	@Test
	public void checkStatusResponse(String status) {
		if("success".equals(status)){
			assertEquals(response.statusCode(),200);
		}
	}

	public void checkResponseNotNull() {
		assertNotNull(response.asString());
	}

	public void checkErrorsInResponse() {
		assertFalse(response.asString().contains("error"));
	}
	
	

}

package com.ac.bdd.todo.api.steps;

import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ac.bdd.todo.api.client.PhoneBookServiceClient;

public class PhoneBookSteps {
	
	private PhoneBookServiceClient phoneBookClient;
	public PhoneBookSteps() {
		phoneBookClient = new PhoneBookServiceClient();
	}
	
	@When("I view phonebook contacts")
	public void getPhoneBookContacts(){
		phoneBookClient.getContacts();
	}
	
	@Then("there are no errors and status is success")
	@Composite(steps = {
			"Then response status is success",
			"Then response entity is not null",
			"Then there are no errors in response"
	})
	public void checkValidResponse(){}
	
	@Then("response status is $status")
	public void checkResponseStatus(String status){
		phoneBookClient.checkStatusResponse(status);
	}
	
	@Then("response entity is not null")
	public void checkResponseNotNull(){
		phoneBookClient.checkResponseNotNull();
	}
	
	@Then("there are no errors in response")
	public void checkErrorsInResponse(){
		phoneBookClient.checkErrorsInResponse();
	}

}

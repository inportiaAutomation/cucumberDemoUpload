package com.inportia.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
       
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {

	}

	@Then("^user should be on homepage$")
	public void user_should_be_on_homepage() throws Throwable {

	}

	@Given("^user enters \"([^\"]*)\" with \"([^\"]*)\"$")
	public void user_enters_with(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);
	}
	
	@Given("^print all the usernames and passowrd$")
	public void print_all_the_usernames_and_passowrd(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}
	
}

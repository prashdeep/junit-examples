package com.sapient.restassured;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class UserRestAPITest {
	
	@Test 
	public void users_resource_returns_ValidId() {

		get("http://jsonplaceholder.typicode.com/users/1")
			.then()
			.statusCode(200)
			.body("id", equalTo(1));

	}

	@Test 
	public void users_resource_returns_Valid_name() {

		get("http://jsonplaceholder.typicode.com/users/2")
			.then()
			.statusCode(200)
			.body("username", equalTo("Antonette"));

	}
	
	@Test 
	public void user_resource_returns_200_with_expected_id_and_values() {

	    when().
	            get("http://jsonplaceholder.typicode.com/users/{id}", 2).
	    then().
	            statusCode(200).
	            body("id", equalTo(2),
	                 "email", equalTo("Shanna@melissa.tv"));

	}

}

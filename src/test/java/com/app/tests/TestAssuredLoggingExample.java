package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class TestAssuredLoggingExample {
    @Test
    public void logging(){
        //log -->proving logging option for request
        given().log().all().when().get("https://uinames.com/api/");


        //log response
        Response response=  RestAssured.get("https://uinames.com/api/");

        response.then().log().all();



    }
}

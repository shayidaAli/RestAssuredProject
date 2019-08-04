package com.app.tests;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StatusCodeValidation {
    @Before
    public static void setup(){
        RestAssured.baseURI="https://uinames.com/api/";

    }

    @Test
    public void testOk(){
        //given  --prep request;
        given().
                //the submit request
                when().get().
                //then verify response
                //  status code --> verify the status code
                then().statusCode(200);
    }
    @Test
    public void notFoundTest(){
        given().
        when().
                //we are trying to pass the wrong value in purpose
                get("dfgsdfgsdfgsdf").
                then().statusCode(404);


    }
}

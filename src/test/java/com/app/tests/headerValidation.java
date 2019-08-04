package com.app.tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class headerValidation {
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://uinames.com/api";

    }

    @Test
    public void headerTest(){
        given().when().get().then().header("Content-Type", "application/json; charset=utf-8");
        //getting the value of the header given in the first parameter, and verify it against the second


    }

}

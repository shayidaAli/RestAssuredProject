package com.app.tests;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class homeWork {

    @Before
    public static void setup(){
        RestAssured.baseURI="https://api.github.com";

    }

    @Test
    public void userTest(){
        //prepare our request
        given().pathParam("username","marufjon").when().get("/users/{username}").prettyPrint();

    }



}

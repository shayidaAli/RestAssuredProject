package com.app.tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class verifyingResponseBody {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI = "https://uinames.com/api";

    }

    @Test
    public void testBody(){
        given().when().get().
        //body ("name"  --> the first param here is a locator,gets the value from the response. it will be actual value
        //second one is matcher
        then().assertThat().body("name",notNullValue());
    }

    @Test
    public void verifyRegion(){
        String region = "Mexico";
        given().queryParam("region",region).when().get().then().log().body().assertThat().body("region",is(region));
    }

    @Test
    public void verifyNumberOfResult(){
       given().
               queryParam("amount",2).
               when().get().
               then().
               assertThat().body("$",hasSize(2));

    }

}

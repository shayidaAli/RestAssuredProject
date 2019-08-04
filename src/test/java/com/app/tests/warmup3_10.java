package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class warmup3_10 {

    @Before
    public void setup() {

        //response is all the information by the path
        Response response = RestAssured.get("https://api.got.show/api");
        RestAssured.baseURI = "https://api.got.show/api";

    }

    //contnent test
    @Test
    public void task1() {
        Response response = RestAssured.get("/continents");
        Assert.assertEquals(200, response.statusCode());
        response.prettyPrint();
        Assert.assertTrue(response.asString().contains("Westeros"));

    }

    //episode tes
    @Test
    public void test2() {
        Response response = RestAssured.get("/episodes/");
        response.prettyPrint();
        Assert.assertTrue(response.asString().contains("Rains of Castamere"));
    }

    //header test
    @Test
    public void test3() {
        Response response = RestAssured.get("/epsodes/");
        System.out.println(response.getHeaders());
        //System.out.println(response.getHeader("/epsodes/"));
        String contentType = response.getHeader("Content-Type");
        System.out.println(contentType);
        Assert.assertEquals(contentType, "text/html; charset=UTF-8");

    }

    //

}

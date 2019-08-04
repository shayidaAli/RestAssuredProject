package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class SimpleRestDemo {
    // rest Assured is just a tool of writing the automation tests of API
    //REST Assured is a Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs
    @Test
    public void test1() {
        //this is class from the rest assured library, it contains methods and object used for  creating and sending requst;
        // get --> method for making a get request, accecpt the resource url as parameter
        Response response = RestAssured.get("https://uinames.com/api");

        // print the response
        response.prettyPrint();

        String resString = response.asString();
        Assert.assertTrue(resString.contains("name"));

        int code = response.statusCode();
        Assert.assertEquals(200, code);

    }

    @Test
    public void HeaderTest() {
        Response response = RestAssured.get("https://uinames.com/api");
        System.out.println("-----" + response.headers());

        String contentType = response.header("Content-Type");
        System.out.println("======" + contentType);
        Assert.assertEquals("application/json; charset=utf-8", contentType);
    }

    @Test
    public void StatusLineTest() {
        Response response = RestAssured.get("https://uinames.com/api");
        String statusLine = response.statusLine();
        System.out.println(statusLine);
        Assert.assertTrue(statusLine.contains("200"));
    }

}

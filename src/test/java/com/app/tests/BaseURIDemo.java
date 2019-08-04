package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class BaseURIDemo {
    @Test
    public void culturesTest(){
        //path is all saving into baseuri
        RestAssured.baseURI="https://api.got.show/doc/";
        Response response= RestAssured.get("/cultures/");
        response.prettyPrint();
    }
}

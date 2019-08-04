package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class accessToeknExample {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI= "https://cybertek-reservation-api-qa.herokuapp.com/";
    }

    @Test
    public void getTokenTest(){
        Response response=  given().log().all().param("email","teacherva5@gmail.com").
                param("password","maxpayne").
                get("sign");

        response.then().log().all().
                assertThat().statusCode(200);
        //this is how we get access code,after run this code, console shows info below:
/*
<html>
  <body>{"accessToken":"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIyMDY0IiwiYXVkIjoidGVhY2hlciJ9.japWZkmQ3ExAJA6HxXEMSm92h5ZfYARx1Ci8sSiLgzM","refreshToken":"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIyMDY0IiwiYXVkIjoidGVhY2hlciJ9.japWZkmQ3ExAJA6HxXEMSm92h5ZfYARx1Ci8sSiLgzM"}</body>
</html>
*/


    }
}

package com.app.tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

public class PostRequestExample {
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://cybertek-reservation-api-qa.herokuapp.com/";

    }


    @Test
    public void createTeam() {

        String token = BookItRestUtility.getTeacherToken();

    }

}

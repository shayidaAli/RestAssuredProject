package com.app.tests;

import io.restassured.RestAssured;
import org.junit.Test;

public class relaxedHttpValidation {
    @Test
    public void relaxYo() {
        RestAssured.get("https://untrusted-root.badssl.com").
                then().log().all().statusCode(200);
    }
}
//authorization: what rights do you have
////authentication: who are you




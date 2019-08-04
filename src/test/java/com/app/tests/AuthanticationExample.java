package com.app.tests;

import io.restassured.RestAssured;
import org.junit.Test;

public class AuthanticationExample {
    @Test
    public void usingApiKey() {
        RestAssured.given().log().all().
                queryParam("t", "YOU").
                queryParam("apikey", "31ce761b").
                when().get("http://omdbapi.com/").then().log().all().assertThat().statusCode(200);

    /* IF WE DONT ADD LINE 11
    the result would be :
    {
    "Response": "False",
    "Error": "No API key provided."}
java.lang.AssertionError: 1 expectation failed.
Expected status code <200> but was <401>.

----because we do not have api for this.
     */
    }

    @Test
    public void BasicAuthentication401validation() {
        // when we try to hit the endpoint without being authorized, we can get the 401 authorized error
        RestAssured.get("https://the-internet.herokuapp.com/basic_auth").then().assertThat().statusCode(401);
    }

    @Test
    public void basicAuthentication() {
        //auth --> provides different types of authentication
        //based -->authentication using username and password
        RestAssured.given().auth().basic("admin","admin").when().get("https://the-internet.herokuapp.com/basic_auth").
                then().assertThat().statusCode(200);

        //api key is one type of authentication, we can also be authenticated by providing a name and password.
    }

    @Test
    public void xmlResponceExample(){
        RestAssured.get("http://parabank.parasoft.com/parabank/services/bank/customers/12212\n" +
                "Message Input").then().log().all().assertThat().statusCode(200);
    }
}

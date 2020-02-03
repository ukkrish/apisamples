package com.frameworks.apitests.base;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class RestAPIbase {

    @Test
    public void getMethod() {
       Response response = get("https://reqres.in/api/users?page=2");
       System.out.println("Response: "+response.getBody().prettyPrint());
       System.out.println("Status code: "+response.getStatusCode());
    }
}

package com.spotify.oauth2.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.spotify.oauth2.api.Route.API;
import static com.spotify.oauth2.api.Route.TOKEN;
import static com.spotify.oauth2.api.SpecBuilder.*;
import static io.restassured.RestAssured.given;

public class RestResources {

    public static Response post(Object requestBody, String token, String path){
        return given(getRequestSpec())
                .auth().oauth2(token)
//                .header("Authorization", "Bearer " + token)
                .body(requestBody).
        when()
                .post(path).
        then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response get(String token, String path){
        return given(getRequestSpec()).
                header("Authorization", "Bearer " + token).
        when()
                .get(path).
        then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response put(Object requestBody, String token, String path){
        return given(getRequestSpec())
                .header("Authorization", "Bearer " + token)
                .body(requestBody).
        when()
                .put(path).
        then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response postAccount(HashMap<String, String> formParams){
        return given(getAccountRequestSpec())
                .formParams(formParams).
        when()
                .post(API + TOKEN).
        then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }
}

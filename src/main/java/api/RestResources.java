package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

import static api.SpecBuilder.*;

public class RestResources {

    public static Response post(Object requestBody, String token, String path){
        return RestAssured.given(getRequestSpec())
                .auth().oauth2(token)
                .body(requestBody).
        when()
                .post(path).
        then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response get(String token, String path){
        return RestAssured.given(getRequestSpec()).
                auth().oauth2(token).
        when()
                .get(path).
        then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response put(Object requestBody, String token, String path){
        return RestAssured.given(getRequestSpec())
                .header("Authorization", "Bearer " + token)
                .body(requestBody).
        when()
                .put(path).
        then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response postAccount(HashMap<String, String> formParams){
        return RestAssured.given(getAccountRequestSpec())
                .formParams(formParams).
        when()
                .post(Route.API + Route.TOKEN).
        then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }
}

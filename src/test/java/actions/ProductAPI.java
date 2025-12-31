package actions;

import base.RequestSpec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ProductAPI {

    public Response getProducts() {
        return given()
                .spec(RequestSpec.getRequestSpec())
                .when()
                .post("/api/productsList");
    }

    public Response searchProduct(String keyword) {
        return given()
                .spec(RequestSpec.getRequestSpec())
                .formParam("search_product", keyword)
                .when()
                .post("/api/searchProduct");
    }
    public Response sendGet(String endpoint) {
        return given()
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public Response sendPost(String endpoint) {
        return given()
                .contentType("application/json")
                .body("{}")
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

}

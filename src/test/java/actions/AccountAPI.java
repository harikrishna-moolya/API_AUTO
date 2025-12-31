package actions;

import base.RequestSpec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AccountAPI {

    public Response deleteUser(String email, String password) {
        return given()
                .spec(RequestSpec.getRequestSpec())
                .formParam("email", email)
                .formParam("password", password)
                .when()
                .delete("/api/deleteAccount");
    }
}

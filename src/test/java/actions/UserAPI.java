package actions;

import base.RequestSpec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserAPI {

    public Response login(String email, String password) {
        return given()
                .spec(RequestSpec.getRequestSpec())
                .formParam("email", email)
                .formParam("password", password)
                .when()
                .post("/api/verifyLogin");
    }

    public Response getUserByEmail(String email) {
        return given()
                .spec(RequestSpec.getRequestSpec())
                .when()
                .get("/api/getUserDetailByEmail?email=" + email);
    }
}

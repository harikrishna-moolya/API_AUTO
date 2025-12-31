/*
package steps;

import io.cucumber.java.en.When;
import io.restassured.response.Response;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.given;
import static steps.CommonSteps.response;

public class UserSteps {

    Logger log = LoggerClass.getLogger(UserSteps.class);

    @When("I login using email {string} and password {string}")
    public void login(String email, String password) {

        response = given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("email", email)
                .formParam("password", password)
                .when()
                .post("/api/verifyLogin")
                .then()
                .extract()
                .response();

        log.info("Login Response: " + response.asString());
    }

    @When("I get user details using email {string}")
    public void getUserDetails(String email) {

        response = given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("email", email)
                .when()
                .post("/api/getUserDetailByEmail")
                .then()
                .extract()
                .response();

        log.info("User Details Response: " + response.asString());
    }
}
*/
package steps.api;

import actions.UserAPI;
import io.cucumber.java.en.When;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

public class UserSteps {

    UserAPI api = new UserAPI();
    Logger log = LoggerClass.getLogger(UserSteps.class);

    @When("api I login using email {string} and password {string}")
    public void login(String email, String password) {
        CommonSteps.response = api.login(email, password);
        log.info("Login Response: " + CommonSteps.response.asString());
    }

    @When("I get user details using email {string}")
    public void getUserDetails(String email) {
        CommonSteps.response = api.getUserByEmail(email);
        log.info("User Details Response: " + CommonSteps.response.asString());
    }
}

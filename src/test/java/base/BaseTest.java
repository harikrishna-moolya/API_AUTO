package hooks;

import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class BaseTest {

    @Before(order = 0)
    public void setup() {
        RestAssured.baseURI = "https://automationexercise.com";
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.defaultParser = Parser.JSON;

        System.out.println(">>> Base URI Set: " + RestAssured.baseURI);
    }
}

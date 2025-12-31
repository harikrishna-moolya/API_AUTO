package steps.api;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;

public class CommonSteps {

    public static Response response;

    @Then("the status code should be {int}")
    public void validateStatusCode(int expectedCode) {

        int actualResponseCode = response.jsonPath().getInt("responseCode");

        System.out.println("Expected: " + expectedCode);
        System.out.println("Actual: " + actualResponseCode);

        Assert.assertEquals(actualResponseCode, expectedCode,
                "API responseCode mismatch!");
    }

    @Then("the response should contain {string}")
    public void validateResponseContains(String text) {
        Assert.assertTrue(response.asString().contains(text),
                "Expected text not found in response!");
    }
}

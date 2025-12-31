/*
package steps;

import io.cucumber.java.en.When;
import io.restassured.response.Response;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.given;
import static steps.CommonSteps.response;

public class ProductsSteps {

    Logger log = LoggerClass.getLogger(ProductsSteps.class);

    @When("I call the products list API")
    public void callProductsList() {

        response = given()
                .contentType("application/json")
                .body("{}")                  // REQUIRED
                .when()
                .post("/api/productsList")
                .then()
                .extract()
                .response();

        log.info("Products List Response: " + response.asString());
    }

    @When("I search products with keyword {string}")
    public void searchProducts(String keyword) {

        response = given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("search_product", keyword)   // REQUIRED
                .when()
                .post("/api/searchProduct")
                .then()
                .extract()
                .response();

        log.info("Search Response: " + response.asString());
    }
}
*/
/*
package steps;

import actions.ProductAPI;
import io.cucumber.java.en.When;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

public class ProductsSteps {

    ProductAPI api = new ProductAPI();
    Logger log = LoggerClass.getLogger(ProductsSteps.class);

    @When("I send GET request to {string}")
    public void getRequest(String endpoint) {
        CommonSteps.response = api.getProducts();
        log.info("Response: " + CommonSteps.response.asString());
    }

    @When("I search products with keyword {string}")
    public void searchProduct(String keyword) {
        CommonSteps.response = api.searchProduct(keyword);
        log.info("Search Response: " + CommonSteps.response.asString());
    }
}
*/
package steps.api;

import actions.ProductAPI;
import io.cucumber.java.en.When;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

import static steps.api.CommonSteps.response;

public class ProductsSteps {

    ProductAPI api = new ProductAPI();
    Logger log = LoggerClass.getLogger(ProductsSteps.class);

    @When("I send GET request to {string}")
    public void getRequest(String endpoint) {

        // GET requests are NOT supported for API.automationexercise.com
        // this step is mainly for NEGATIVE testing (405 expected)

        response = api.sendGet(endpoint);  // handles dynamic GET calls

        log.info("Response: " + response.asString());
    }

    @When("I send POST request to {string}")
    public void postRequest(String endpoint) {

        // productsList must use POST + empty JSON body
        if (endpoint.equals("/api/productsList")) {
            response = api.getProducts();
        }
        // brandsList must also use POST for negative test
        else {
            response = api.sendPost(endpoint);
        }

        log.info("Response: " + response.asString());
    }

    @When("I search products with keyword {string}")
    public void searchProduct(String keyword) {
        response = api.searchProduct(keyword);
        log.info("Search Response: " + response.asString());
    }
}

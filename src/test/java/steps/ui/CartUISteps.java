/*
package steps.ui;

import io.cucumber.java.en.When;
import ui.driver.DriverFactory;
import ui.pages.CartPage;

public class CartUISteps {

    CartPage cart = new CartPage(DriverFactory.getDriver());

    @When("I click checkout on cart page")
    public void checkout() {
        cart.clickCheckout();
    }
}
*/
package steps.ui;

import io.cucumber.java.en.When;
import ui.driver.DriverFactory;
import ui.pages.CartPage;

public class CartUISteps {

    CartPage cart = new CartPage(DriverFactory.getDriver());

    @When("I click checkout on cart page")
    public void checkout() {
        cart.clickCheckout();
    }
}

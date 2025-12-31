package steps.ui;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import ui.driver.DriverFactory;
import ui.pages.CartPage;

public class CartVerificationSteps {

    CartPage cart = new CartPage(DriverFactory.getDriver());

    @Then("I should see at least one product in cart")
    public void verifyCartNotEmpty() {
        Assert.assertTrue(cart.isCartNotEmpty(),
                "Cart is empty — expected at least 1 product!");
    }
}

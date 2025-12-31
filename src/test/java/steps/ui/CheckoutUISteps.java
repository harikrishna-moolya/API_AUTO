/*
package steps.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import ui.driver.DriverFactory;
import ui.pages.CheckoutPage;

public class CheckoutUISteps {

    WebDriver driver = DriverFactory.getDriver();
    CheckoutPage checkout = new CheckoutPage(driver);

    @And("I choose to login from checkout page")
    public void chooseToLoginFromCheckout() {
        checkout.clickLoginFromPopup();
    }

    @Then("I should reach homepage after login")
    public void verifyHomepageAfterLogin() {
        checkout.verifyHomeReached();
    }
}
*/
package steps.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import ui.driver.DriverFactory;
import ui.pages.CheckoutPage;
import ui.pages.LoginPage;

public class CheckoutUISteps {

    WebDriver driver = DriverFactory.getDriver();
    CheckoutPage checkout = new CheckoutPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @And("I choose to login from checkout page")
    public void chooseToLoginFromCheckout() {
        checkout.clickLoginFromPopup();
    }

    @When("I login using email {string} and password {string}")
    public void loginUsingCredentials(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("I should reach homepage after login")
    public void verifyHomepageAfterLogin() {
        checkout.verifyHomeReached();
    }

    // --------------------------------------
    // ⭐ NEW STEP: Validate checkout page
    // --------------------------------------
    @Then("I should be on checkout page")
    public void verifyCheckoutPage() {
        boolean urlMatched = checkout.isCheckoutPageReached();
        boolean contentMatched = checkout.isCheckoutContentVisible();

        if (!urlMatched && !contentMatched) {
            throw new AssertionError("FAILED: Not redirected to checkout page!");
        }
    }
    @Then("I should see login popup on checkout")
    public void verifyLoginPopupVisible() {
        boolean popupVisible = checkout.isLoginPopupVisible();

        if (!popupVisible) {
            throw new AssertionError("FAILED: Login popup did NOT appear after clicking checkout!");
        }
    }

}


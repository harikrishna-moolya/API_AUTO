/*
package steps.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ui.driver.DriverFactory;
import ui.pages.LoginPage;

public class LoginUISteps {

    LoginPage login = new LoginPage(DriverFactory.getDriver());

    @When("I login using email {string} and password {string}")
    public void login(String email, String password) {
        login.login(email, password);
    }
    @Then("I should stay on login page with error message")
    public void stayOnLoginPageWithError() {
        LoginPage login = new LoginPage(DriverFactory.getDriver());
        Assert.assertTrue(login.isLoginErrorDisplayed(), "Error message not shown!");
    }

}
*/
package steps.ui;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.driver.DriverFactory;
import ui.pages.LoginPage;

public class LoginUISteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on login page")
    public void i_am_on_login_page() {
        loginPage.openSite();
    }

    @When("I enter login email {string}")
    public void i_enter_login_email(String email) {
        loginPage.enterEmail(email);
    }

    @When("I enter login password {string}")
    public void i_enter_login_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to homepage")
    public void i_should_be_redirected_to_homepage() {
        Assert.assertTrue(loginPage.isHomePageLoaded(),
                "Home page redirection failed");
    }

    @Then("I should stay on login page with error message")
    public void stayOnLoginPageWithError() {
        Assert.assertTrue(loginPage.isLoginErrorDisplayed(),
                "Error message NOT displayed on invalid login");
    }
    @Then("I should see email validation error")
    public void shouldSeeEmailValidationError() {
        Assert.assertTrue(loginPage.isEmailFieldInvalid(),
                "Email input did NOT show validation error!");

        System.out.println("Validation: " + loginPage.getEmailValidationMessage());
    }
    @Then("I should see password validation error")
    public void shouldSeePasswordValidationError() {
        Assert.assertTrue(loginPage.isPasswordFieldInvalid(),
                "Password input did NOT show validation error!");

        System.out.println("Validation: " + loginPage.getPasswordValidationMessage());
    }


}


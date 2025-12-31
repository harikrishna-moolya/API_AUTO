/*
package steps.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ui.driver.DriverFactory;
import ui.pages.ProductsPage;

public class ProductsUISteps {

    ProductsPage products = new ProductsPage(DriverFactory.getDriver());

    @When("I open products page")
    public void openProducts() {
        products.openProductsPage();
    }

    @When("I add first product to cart")
    public void addToCart() {
        products.addFirstProductToCart();
    }

    @When("I continue shopping after adding product")
    public void continueShopping() {
        products.clickContinueShopping();
    }

    @When("I go to cart page")
    public void goToCart() {
        products.goToCartPage();
    }

    //adding new methods
    @Then("I should remain on products page")
    public void shouldRemainOnProductsPage() {
        ProductsPage p = new ProductsPage(DriverFactory.getDriver());
        Assert.assertTrue(p.isOnProductsPage(), "Not on products page!");
    }

    @Then("I should see all product listings visible")
    public void shouldSeeProductsVisible() {
        ProductsPage p = new ProductsPage(DriverFactory.getDriver());
        Assert.assertTrue(p.areProductsVisible(), "Products not visible!");
    }

}
*/
package steps.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ui.driver.DriverFactory;
import ui.pages.ProductsPage;

public class ProductsUISteps {

    ProductsPage products = new ProductsPage(DriverFactory.getDriver());

    // For steps: "I go to products page" AND "I open products page"
    @When("I go to products page")
    @When("I open products page")
    public void goToProducts() {
        products.goToProducts();
    }

    // For: "I add first product to cart"
    @When("I add first product to cart")
    public void addToCart() {
        products.addFirstProductToCart();
    }

    // For: "I continue shopping" AND "I continue shopping after adding product"
    @When("I continue shopping")
    @When("I continue shopping after adding product")
    public void continueShopping() {
        products.clickContinueShopping();
    }

    // For: "I open cart page" AND "I go to cart page"
    @When("I open cart page")
    @When("I go to cart page")
    public void goToCart() {
        products.goToCart();
    }

    // For: "I should remain on products page"
    @Then("I should remain on products page")
    public void shouldRemainOnProductsPage() {
        Assert.assertTrue(products.isOnProductsPage(),
                "❌ FAILED: Not on products page!");
    }

    // For: "I should see all product listings visible"
    @Then("I should see all product listings visible")
    public void shouldSeeAllProductListingsVisible() {
        Assert.assertTrue(products.areProductsVisible(),
                "❌ FAILED: Product listings not visible!");
    }
}

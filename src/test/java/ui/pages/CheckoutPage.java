/*
package ui.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By loginPopupBtn = By.xpath("//u[normalize-space()='Register / Login']");
    private By homeSlider = By.cssSelector("#slider"); // homepage unique element

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(12));
    }

    public void clickLoginFromPopup() {
        WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(loginPopupBtn));
        popup.click();
    }

    public void verifyHomeReached() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeSlider));
    }
}
*/
package ui.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class CheckoutPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By loginPopupBtn = By.xpath("//u[text()='Register / Login']");
    private By homePageLogo = By.xpath("//a[contains(text(),'Home')]");
    private By checkoutHeader = By.xpath("//h2[contains(text(),'Checkout')]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(12));
    }

    private void hideAds() {
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelectorAll('iframe, .adsbygoogle, #ad_position_box, .modal-backdrop')" +
                        ".forEach(e => e.remove());"
        );
    }

    public void clickLoginFromPopup() {
        hideAds();

        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(loginPopupBtn));
        try {
            btn.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
        }
    }

    public void verifyHomeReached() {
        hideAds();
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePageLogo));
    }


    // --------------------------------------
    // ⭐ NEW METHOD 1: Verify Checkout Page URL
    // --------------------------------------
    public boolean isCheckoutPageReached() {
        hideAds();
        try {
            return driver.getCurrentUrl().contains("/checkout");
        } catch (Exception e) {
            return false;
        }
    }

    // --------------------------------------
    // ⭐ NEW METHOD 2: Verify checkout content exists
    // (Backup validation)
    // --------------------------------------
    public boolean isCheckoutContentVisible() {
        hideAds();
        try {
            return driver.findElement(checkoutHeader).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    // ADD THIS NEW LOCATOR + METHOD (do NOT change anything else)

    private By loginPopupTitle = By.xpath("//h2[contains(text(),'Login to your account')]");

    // NEW METHOD
    public boolean isLoginPopupVisible() {
        try {
            hideAds();
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(loginPopupTitle));
            return popup.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}

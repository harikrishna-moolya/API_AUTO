/*
package ui.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
*/
package ui.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);
        }
        return driver;
    }

    // ⭐ UNIVERSAL AD REMOVER (GLOBAL FIX)
    public static void removeAds(WebDriver driver) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript(
                    "document.querySelectorAll('iframe, .adsbygoogle, #ad_position_box, .modal-backdrop, #aswift_0, #aswift_1, .popup').forEach(e => e.remove());"
            );

            js.executeScript(
                    "document.querySelectorAll('.modal.show, .modal').forEach(e => e.style.display='none');"
            );

        } catch (Exception ignored) {}
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

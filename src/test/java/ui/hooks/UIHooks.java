package ui.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ui.driver.DriverFactory;

public class UIHooks {

    @Before("@UI")
    public void before() {
        DriverFactory.getDriver();
    }

    @After("@UI")
    public void after() {
        DriverFactory.quitDriver();
    }
}

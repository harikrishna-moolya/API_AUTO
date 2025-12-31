/*
package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

public class Hooks {

    Logger log = LoggerClass.getLogger(Hooks.class);

    @Before
    public void startScenario() {
        log.info("===== Starting Scenario =====");
    }

    @After
    public void endScenario() {
        log.info("===== Ending Scenario =====");
    }
}
*/
package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

public class Hooks {

    Logger log = LoggerClass.getLogger(Hooks.class);

    @Before(order = 1)
    public void beforeScenario() {
        log.info("===== Starting Scenario =====");
    }

    @After
    public void afterScenario() {
        log.info("===== Ending Scenario =====");
    }
}

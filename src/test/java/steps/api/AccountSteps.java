package steps.api;

import actions.AccountAPI;
import io.cucumber.java.en.When;
import logger.LoggerClass;
import org.apache.logging.log4j.Logger;

public class AccountSteps {

    AccountAPI api = new AccountAPI();
    Logger log = LoggerClass.getLogger(AccountSteps.class);

    @When("I delete user with email {string} and password {string}")
    public void deleteUser(String email, String password) {
        CommonSteps.response = api.deleteUser(email, password);
        log.info("Delete Response: " + CommonSteps.response.asString());
    }
}

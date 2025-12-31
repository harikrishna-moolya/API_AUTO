package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/api",
                "src/main/resources/features/ui",
                "src/main/resources/features/integration"
        },
        glue = {
                "steps.ui",
                "steps.api",
                "steps.integration",
                "hooks"
        },
        tags = "@integration",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/integration.html",
                "json:target/cucumber-reports/integration.json",
        },
        monochrome = true
)
public class IntegrationTestRunner extends AbstractTestNGCucumberTests {
}

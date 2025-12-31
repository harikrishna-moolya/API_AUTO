package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/ui",
                "src/main/resources/features/api",
                "src/main/resources/features/integration",
                "src/main/resources/features/e2e"
        },
        glue = {
                "steps.ui",
                "steps.api",
                "steps.integration",
                "hooks"
        },
        tags = "@e2e",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/e2e.html",
                "json:target/cucumber-reports/e2e.json"
        },
        monochrome = true
)
public class E2ETestRunner extends AbstractTestNGCucumberTests {
}

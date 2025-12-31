package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@UI",
        features = "src/main/resources/features/ui",
        glue = { "steps.ui", "ui.hooks" },
        plugin = {"pretty", "html:target/ui-report.html"}
)
public class UiRunner extends AbstractTestNGCucumberTests {
}

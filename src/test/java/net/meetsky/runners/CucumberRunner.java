package net.meetsky.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "net/meetsky/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@login",
        plugin = {
                "html:target/default-report",
                "json:target/cucumberLogin.json"
        }
)

public class CucumberRunner {
}

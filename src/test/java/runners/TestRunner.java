package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this is the basic Test Runner, which will run all .feature files in our "features" folder
// glue is just the package, where we have our Step Definitions

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefs",
        plugin = {"pretty", "html:target/cucumber-regression-report.html"}
)
public class TestRunner {

}

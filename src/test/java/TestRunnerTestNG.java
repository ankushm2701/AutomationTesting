import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/FeatureFile"},
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = "StepDefinition")
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
}

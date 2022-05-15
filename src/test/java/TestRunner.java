import com.testing.BrowserHandling;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureFile"},
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = "StepDefinition",
        tags = "@Test"
)
public class TestRunner extends BrowserHandling {


}

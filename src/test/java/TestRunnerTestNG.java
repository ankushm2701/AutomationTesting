import com.testing.BrowserHandling;
import com.testing.CommonComponent;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

@CucumberOptions(features = {"src/test/java/FeatureFile"},
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = "StepDefinition",
        tags = {"@Test"}
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void launchBrowser(){
        BrowserHandling.initializeBrowser("chrome");
    }
    @AfterClass
    public void terminateBrowser(){
        CommonComponent.terminate();
    }
}
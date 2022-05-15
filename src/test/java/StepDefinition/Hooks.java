package StepDefinition;

import com.testing.BrowserHandling;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BrowserHandling {

    @Before
    public void launchBrowser(){
        initializeBrowser("chrome");
    }

    @After
    public void terminate(){
        driver.quit();
    }
}

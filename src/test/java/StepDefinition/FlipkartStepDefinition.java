package StepDefinition;


import PageObjects.FlipkartPageObject;
import com.testing.BrowserHandling;
import com.testing.CommonComponent;
import com.testing.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FlipkartStepDefinition extends BrowserHandling{

    @Given("^User Navigate to \"([^\"]*)\"$")
    public void userNavigateTo(String url) throws Throwable {
        //BrowserHandling.initializeBrowser("chrome",url);
        driver.navigate().to(url);
    }

    @When("^I enter emailId and password$")
    public void iEnterEmailIdAndPassword() {
        FlipkartPageObject fpo=new FlipkartPageObject(driver);
        CommonComponent.waitUntilCondition(20, Constant.ExpectedElementCondition.ElementToBeClickable, Constant.PropertyType.Xpath, "//input[@class='_2zrpKA _1dBPDZ']","");
        fpo.login("","");
    }

    @Then("^I is able see the Home Page of FlipKart\\.$")
    public void iIsAbleSeeTheHomePageOfFlipKart() {
        String text=BrowserHandling.driver.findElement(By.xpath("//div[text()=' ']")).getText().toLowerCase();
        Assert.assertEquals(text," ");
        //CommonComponent.terminate();
    }
}

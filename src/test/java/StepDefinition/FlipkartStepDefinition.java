package StepDefinition;


import PageObjects.FlipkartPageObject;
import com.testing.BrowserHandling;
import com.testing.CommonComponent;
import com.testing.Constant;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FlipkartStepDefinition {

    @Given("^User Navigate to \"([^\"]*)\"$")
    public void userNavigateTo(String url) throws Throwable {
        BrowserHandling.initializeBrowser("chrome", url);
    }

    @When("^User enter emailId and password$")
    public void userEnterEmailIdAndPassword() {
        FlipkartPageObject fpo=new FlipkartPageObject(BrowserHandling.driver);
        CommonComponent.waitUntilCondition(20, Constant.ExpectedElementCondition.ElementToBeClickable, Constant.PropertyType.Xpath, "//input[@class='_2zrpKA _1dBPDZ']","");
        fpo.login("9177310833","ankush1234");
    }

    @Then("^User is able see the Home Page of FlipKart\\.$")
    public void userIsAbleSeeTheHomePageOfFlipKart() {
        String text=BrowserHandling.driver.findElement(By.xpath("//div[text()='ANKUSH']")).getText().toLowerCase();
        Assert.assertEquals(text,"ankush");
    }
}

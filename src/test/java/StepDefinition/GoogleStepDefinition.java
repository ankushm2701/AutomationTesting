package StepDefinition;

import PageObjects.GoogleSearchPageObject;
import com.testing.BrowserHandling;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GoogleStepDefinition extends BrowserHandling {

    @Given("^I Navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) {
        driver.navigate().to(url);
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
    }

    @Then("^I should see result with Automation Testing$")
    public void iShouldSeeResultWithAutomationTesting() {
        boolean text=BrowserHandling.driver.findElement(By.xpath("//h3[contains(text(),'Automation Testing')]")).isDisplayed();
        Assert.assertTrue(BrowserHandling.driver.findElement(By.xpath("//h3[contains(text(),'Automation Testing')]")).isDisplayed());
    }

    @When("^I write \"([^\"]*)\" in search box$")
    public void iWriteInSearchBox(String value) {
       GoogleSearchPageObject gspo=new GoogleSearchPageObject(BrowserHandling.driver);
       gspo.writeInSearchBox(value);
    }
}

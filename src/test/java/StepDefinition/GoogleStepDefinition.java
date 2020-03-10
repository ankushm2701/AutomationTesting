package StepDefinition;

import PageObjects.GoogleSearchPageObject;
import com.testing.BrowserHandling;
import com.testing.CommonComponent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class GoogleStepDefinition {

    @Given("^I Navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) throws Throwable {
        BrowserHandling.driver.navigate().to(url);
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        BrowserHandling.driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
    }

    @Then("^I should see result with Automation Testing$")
    public void iShouldSeeResultWithAutomationTesting() {
        Boolean text=BrowserHandling.driver.findElement(By.xpath("//h3[contains(text(),'Automation Testing')]")).isDisplayed();
        Assert.assertTrue(BrowserHandling.driver.findElement(By.xpath("//h3[contains(text(),'Automation Testing')]")).isDisplayed());
    }

    @When("^I write \"([^\"]*)\" in search box$")
    public void iWriteInSearchBox(String value) throws Throwable {
       GoogleSearchPageObject gspo=new GoogleSearchPageObject(BrowserHandling.driver);
       gspo.writeInSearchBox(value);
    }
}

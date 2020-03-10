package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageObject {

    public GoogleSearchPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='q']")
    public WebElement searchTextBox;


    public void writeInSearchBox(String value){
        searchTextBox.sendKeys(value);
    }
}

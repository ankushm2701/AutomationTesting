package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPageObject {

    public FlipkartPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@class='_2zrpKA _1dBPDZ']")
    public WebElement emailMobileNoTextBox;

    @FindBy(how = How.CSS, using = "input._2zrpKA._3v41xv._1dBPDZ")
    public WebElement passwordTextBox;

    @FindBy(how = How.CSS, using = "button._2AkmmA._1LctnI._7UHT_c")
    public WebElement btnLogin;

    public void login(String emailOrMobileNo, String password){
        emailMobileNoTextBox.sendKeys(emailOrMobileNo);
        passwordTextBox.sendKeys(password);
        btnLogin.click();
    }
}


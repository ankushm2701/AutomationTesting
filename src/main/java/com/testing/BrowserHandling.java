package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BrowserHandling {
    public static WebDriver driver;

    //Open Browser
    public static void initializeBrowser(String browserType) {
        if (browserType.toLowerCase().contains("chrome")) {
            try {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                options.addArguments("start-maximized");
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_EXE);
                driver = new ChromeDriver(options);
            } catch (Exception e) {
                System.out.println("Exception in Chrome Browser");
                e.printStackTrace();
                Assert.fail("Error in Opening Browser");
            }
        }
        else if (browserType.toLowerCase().contains("firefox")) {
            try {

                System.setProperty("webdriver.gecko.driver", Constant.FIREFOX_DRIVER_EXE);
                FirefoxOptions options = new FirefoxOptions();
                options.setCapability("marinotte", true);
                options.setLegacy(true);
                driver = new FirefoxDriver(options);
            } catch (Exception e) {
                System.out.println("Exception in Chrome Browser");
                e.printStackTrace();
                Assert.fail("Error in Opening Browser");
            }
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
        //driver.navigate().to(url);
    }
}

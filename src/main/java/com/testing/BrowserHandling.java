package com.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.time.Duration;
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

                //System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_EXE);
                driver = WebDriverManager.chromedriver().capabilities(capabilities).create();
            } catch (Exception e) {
                System.out.println("Exception in Chrome Browser");
                e.printStackTrace();
                Assert.fail("Error in Opening Browser");
            }
        }
        else if (browserType.toLowerCase().contains("firefox")) {
            try {

                //System.setProperty("webdriver.gecko.driver", Constant.FIREFOX_DRIVER_EXE);
                FirefoxOptions options = new FirefoxOptions();
                options.setCapability("marinotte", true);
                driver = WebDriverManager.firefoxdriver().capabilities(options).create();
            } catch (Exception e) {
                System.out.println("Exception in Chrome Browser");
                e.printStackTrace();
                Assert.fail("Error in Opening Browser");
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
    }
}

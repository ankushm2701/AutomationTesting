package com.testing;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;


public class CommonComponent extends BrowserHandling{

    //quit window driver session
    public static void terminate() {
        driver.quit();
    }

    //Close current browser
    public static void close(){
        driver.close();
    }

    public static void jsClick(WebElement element){
        try {
            JavascriptExecutor js = (JavascriptExecutor) BrowserHandling.driver;
            js.executeScript("arguments[0].click();", element);
        }catch (Exception e){
            System.out.println("===============================================================");
            takeScreenShot();
            e.printStackTrace();
            System.out.println("===============================================================");
        }
    }

    public static void jsEnterText(WebElement element, String text){
        try {
            JavascriptExecutor js = (JavascriptExecutor) BrowserHandling.driver;
            js.executeScript("arguments[0].value='" + text +"';", element);
        }catch (Exception e){
            System.out.println("===============================================================");
            takeScreenShot();
            e.printStackTrace();
            System.out.println("===============================================================");
        }
    }

    public static void ScrollUp(){
        try {
            JavascriptExecutor js = (JavascriptExecutor) BrowserHandling.driver;
            js.executeScript("windows.scrollBy(0, -250)", BrowserHandling.driver);
        }catch (Exception e){
            System.out.println("===============================================================");
            takeScreenShot();
            e.printStackTrace();
            System.out.println("===============================================================");
        }
    }

    public static void ScrollDown(){
        try {
            JavascriptExecutor js = (JavascriptExecutor) BrowserHandling.driver;
            js.executeScript("windows.scrollBy(0, 250)", BrowserHandling.driver);
        }catch (Exception e){
            System.out.println("===============================================================");
            takeScreenShot();
            e.printStackTrace();
            System.out.println("===============================================================");
        }
    }

    public static void ScrollIntoView(WebElement element){
        try{
            JavascriptExecutor js = (JavascriptExecutor) BrowserHandling.driver;
            js.executeScript("argument[0].scrollIntoView(true);", element);
        }catch (Exception e){
            System.out.println("===============================================================");
            takeScreenShot();
            e.printStackTrace();
            System.out.println("===============================================================");
        }
    }


    public static void takeScreenShot() {
        Date date=new Date();
        String screenshotFile = date.toString().replace(":","_").replace(" ","_");
        String filepath = Constant.REPORT_PATH + "screenshots\\" + screenshotFile;
        try {
            File ssFile = ((TakesScreenshot)BrowserHandling.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(ssFile, new File(filepath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void waitUntilCondition(int second, Constant.ExpectedElementCondition expectedCondition, Constant.PropertyType findElementBy, String element, String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        switch (expectedCondition){
            case ElementToBeSelected:
                if(Constant.PropertyType.Id == findElementBy)
                    wait.until(ExpectedConditions.elementToBeSelected(By.id(element)));
                else if(Constant.PropertyType.CssSelector == findElementBy)
                     wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector(element)));
                else if(Constant.PropertyType.Xpath == findElementBy)
                    wait.until(ExpectedConditions.elementToBeSelected(By.xpath(element)));
                break;
            case ElementToBeClickable:
                if(Constant.PropertyType.Id == findElementBy)
                    wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
                else if(Constant.PropertyType.CssSelector == findElementBy)
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(element)));
                else if(Constant.PropertyType.Xpath == findElementBy)
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
                break;
            case ElementSelectionStateToBe:
                if(Constant.PropertyType.Id == findElementBy)
                    wait.until(ExpectedConditions.elementSelectionStateToBe(By.id(element),true));
                else if(Constant.PropertyType.CssSelector == findElementBy)
                    wait.until(ExpectedConditions.elementSelectionStateToBe(By.cssSelector(element), true));
                else if(Constant.PropertyType.Xpath == findElementBy)
                    wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(element),true));
                break;
            case TextToBePresentInElementLocated:
                if(Constant.PropertyType.Id == findElementBy)
                    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(element), text));
                else if(Constant.PropertyType.CssSelector == findElementBy)
                    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(element), text));
                else if(Constant.PropertyType.Xpath == findElementBy)
                    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(element), text));
                break;

        }
    }
}

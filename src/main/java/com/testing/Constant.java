package com.testing;

public class Constant {

    public static final String REPORT_PATH="c:\\Reports\\";

    public static final String CHROME_DRIVER_EXE="src\\test\\resources\\chromedriver.exe";
    public static final String FIREFOX_DRIVER_EXE="src\\test\\resources\\geckodriver.exe";

    public enum ExpectedElementCondition{
        ElementSelectionStateToBe,
        ElementToBeClickable,
        ElementToBeSelected,
        TextToBePresentInElementLocated
    }

    public enum PropertyType{
        Id,
        CssSelector,
        Xpath
    }
}

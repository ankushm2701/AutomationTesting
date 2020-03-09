$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FlipKart.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "Verify user able to Login in FlipKart and Land on HomePage.",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user can Login in FlipKart site",
  "description": "",
  "id": ";verify-user-can-login-in-flipkart-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Navigate to \"https://www.flipkart.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter emailId and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is able see the Home Page of FlipKart.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.flipkart.com",
      "offset": 18
    }
  ],
  "location": "FlipkartStepDefinition.userNavigateTo(String)"
});
formatter.result({
  "duration": 6203258200,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.userEnterEmailIdAndPassword()"
});
formatter.result({
  "duration": 858560400,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.userIsAbleSeeTheHomePageOfFlipKart()"
});
formatter.result({
  "duration": 26255157900,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//div[text()\u003d\u0027ANKUSH\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027USHYDAMONGA3\u0027, ip: \u002710.8.94.72\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.6\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinition.FlipkartStepDefinition.userIsAbleSeeTheHomePageOfFlipKart(FlipkartStepDefinition.java:31)\r\n\tat ✽.Then User is able see the Home Page of FlipKart.(FlipKart.feature:7)\r\n",
  "status": "failed"
});
});
Feature: Google Search Results.

  @Test
  Scenario: Verify the result found While searching Automation Testing in Google
    Given I Navigate to "https://www.google.com"
    When I write "AutomationTesting" in search box
    And I click on search button
    Then I should see result with Automation Testing

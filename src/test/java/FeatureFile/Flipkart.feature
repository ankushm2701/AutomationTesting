Feature: Add product in add to cart of Flipkart.

  Scenario: Verify user can Login in Flipkart site.
    Given I Navigate to "https://www.flipkart.com"
    When  I enter emailId and password
    Then  I is able see the Home Page of FlipKart.
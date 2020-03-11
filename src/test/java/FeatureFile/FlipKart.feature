Feature: Add product in add to cart of FlipKart.

  Scenario: Verify user can Login in FlipKart site.
    Given I Navigate to "https://www.flipkart.com"
    When  I enter emailId and password
    Then  I is able see the Home Page of FlipKart.
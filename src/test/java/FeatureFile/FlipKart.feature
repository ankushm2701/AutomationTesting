Feature:
  Verify user able to Login in FlipKart and Land on HomePage.

  Scenario: Verify user can Login in FlipKart site.
    Given I Navigate to "https://www.flipkart.com"
    When  I enter emailId and password
    Then  I is able see the Home Page of FlipKart.
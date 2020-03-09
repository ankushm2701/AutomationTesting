Feature:
  Verify user able to Login in FlipKart and Land on HomePage.

  Scenario: Verify user can Login in FlipKart site
    Given User Navigate to "https://www.flipkart.com"
    When  User enter emailId and password
    Then  User is able see the Home Page of FlipKart.
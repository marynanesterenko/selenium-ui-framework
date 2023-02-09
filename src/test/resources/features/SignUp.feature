Feature: Test Sign Up functionality

  Scenario: verify the user is able to sign up with fake credentials
    Given the user has access to the Sign Up link
    And the user clicks on the sign up link
    When the user fills out the initial registration form
    And clicks on the Next button
    And fills out the second registration form and enables the Terms and Conditions checkbox
    And clicks on the Register button
    Then the user can see the confirmation message
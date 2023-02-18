Feature: login feature

  Background:
    Given user navigates to Digital Bank Login Page

  @smoke
  Scenario: Verify user is able to login with valid credentials
    When user enters valid username and valid password
         | username | password |
         | username | password |

  @smoke
  Scenario: Verify user is unable to login with invalid credentials
    Given user enters invalid "invalid.username" and "invalid.password"
    When user clicks on Sign In button
    Then verify invalid login error message is displayed

  @smoke
  Scenario: Verify user is able to save their credentials after enabling remember me checkbox
    Given user enters valid "valid.username" and "valid.password"
    When user enables remember me checkbox
    And user clicks Sign In button and navigates back to the Login Page
    And user clicks on Sign In button
    Then verify user is successfully logged in to the account

    Scenario: Verify the user is
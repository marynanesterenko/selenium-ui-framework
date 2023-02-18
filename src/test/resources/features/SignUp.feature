Feature: sign up feature

  Background:
    Given user navigates to Digital Bank Login Page
    And and Sign Up Here link is present

  Scenario: verify user is able to access sign up page
    When user clicks on the Sign Up Here link
    Then user is on sign up page and the bank logo is present

  Scenario: verify the user is able to complete the first part of the sign up process
    When user fill out all the input fields

      | title | firstName | lastName | gender | dateOfBirth | SSN | email | password | confirmPassword |
      | Mr. | Timothy  | Cooper | M |  | SSN | email | password | confirmPassword |
      | title | firstName | lastName | gender | dateOfBirth | SSN | email | password | confirmPassword |
      | title | firstName | lastName | gender | dateOfBirth | SSN | email | password | confirmPassword |

    And clicks Next button
    Then user is


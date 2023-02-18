Feature: New Savings account

  Background:
    Given a user navigates to a digital bank
    When user enters valid username and password
    And user clicks on Sign In button
    Then verify user is on the home page

    Scenario Outline: verify user can create new Savings Account with minimum opening deposit
      Given user clicks on Savings dropdown menu
      And user selects New Saving menu item
      Then user is transferred to Create Savings Page
      When user selects "<Savings Account Type>"
      And user selects "<Account Ownership>"
      And enters their "<Account Name>" on the Account Name input field
      And user enters "<Initial deposit>" in the Initial Deposit field
      And user clicks on Submit button
      Then verify user is transferred to View Savings Account Page
      Then verify new savings account was created
      Examples:
        | Savings Account Type | Account Ownership | Account Name  | Initial deposit    |
        | Savings              | Individual        | HouseSavings  | 25                 |
        | Money Market         | Money Market      | SchoolSavings | 2500               |


Feature: Create An Account

  Background:
    Given the user is on the home page
    And the user click to sign in button

   Scenario: User should able to create an account with valid credentials
    When the user enters an email address
    And the user clicks Create an Account button
    Then account creation page should be displayed
    And the user enters valid information
    Then the user successfully should register and to see welcome message


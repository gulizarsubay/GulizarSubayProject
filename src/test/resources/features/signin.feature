@smoke
Feature: Sign in

  Background:
    Given the user is on the home page
    And the user click to sign in button

  Scenario: User should able to sign in with valid credentials
    When the user logs in with valid information "username" "password"
    Then the user login the account successfully and see his name

  Scenario: User should not able to sign in with invalid credentials
    When the user logs in with invalid information "username" "password"
    Then the user should see an error message


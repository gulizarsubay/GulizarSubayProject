Feature: Sign out

  Background:
    Given the user is on the home page
    And the user click to sign in button
    When the user logs in with valid information "username" "password"
    Then the user login the account successfully and see his name

  Scenario: User should able to sign out
    When the user clicks sign out
    Then the sign in page should be show

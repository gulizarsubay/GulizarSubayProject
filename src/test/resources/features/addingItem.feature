
Feature: Adding item functionality

  Background:
    Given the user is on the home page
    And the user click to sign in button
    When the user logs in with valid information "username" "password"
    Then the user login the account successfully and see his name

    Scenario: The user able to add item to the cart
      When the user selects dresses
      And the user selects evening dresses
      And the user selects first item
      Then Item should get added to the cart
      Then the user able to click to proceed to checkout




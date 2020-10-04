Feature: Login



  Scenario:
    Given user login the account
    When the user clicks signout button
    And the user logout
    Then The sign in page should be show

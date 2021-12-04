Feature: Using Employee functions
  @employee
  Scenario: Displaying Company Structure

    Given User is on the login page
    And The user logs in with "hr" username and "UserUser" password
    When User navigates to Employee module from left side menu
    Then User should be able to display Company Structure
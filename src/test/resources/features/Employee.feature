Feature: Using Employee functions

  Background: Login
    Given User is on the login page
    And The user logs in with "hr" username and "UserUser" password

  Scenario: Displaying Company Structure
    When User navigates to Employee module from left side menu
    Then User should be able to display Company Structure

  @employee
  Scenario: Adding new department
    When User navigates to Employee module from left side menu
    And User clicks Add Department button
    And User types a name for department
    And User selects the parent department
    Then User clicks Add button

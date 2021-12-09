Feature: Using Employee functions

  Background: Login
    Given User is on the login page
    And The user logs in with "hr" username and "UserUser" password
    When User navigates to Employee module from left side menu

  Scenario: Displaying Company Structure
    Then User should be able to display Company Structure

  @employee
  Scenario: Adding new department
    And User clicks Add Department button
    And User types a name for department
    And User selects the parent department
    Then User clicks Add button

  Scenario: Finding employee using search by alphabet
    When User navigates Find Employee tab
    And User clicks Search by Alphabet
    And User picks a letter to search an employee

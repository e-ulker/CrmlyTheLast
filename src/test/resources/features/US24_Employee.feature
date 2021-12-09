Feature: Using Employee functions
  Agile Story : As a user, I should be able to use functions under Employee menu

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

  Scenario: Exporting the employee list
    When User navigates Find Employee tab
    And User clicks on More button
    And User clicks on Export to Excel

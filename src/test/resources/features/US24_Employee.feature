Feature: Using Employee functions
  Agile Story : As a user, I should be able to use functions under Employee menu

  Background:
		#@REM-983
    Given User is on the login page
    And The user logs in with "hr" username and "UserUser" password
    When User navigates to Employee module from left side menu

  @REM-984 @sedat
  Scenario: US24_TC01_User should be able to display company structure.
    Then User should be able to display Company Structure


  @REM-985 @sedat
  Scenario: US24_TC02_User should be able to add a department.
    And User clicks Add Department button
    And User types a name for department
    And User selects the parent department
    Then User clicks Add button

  @REM-989 @sedat
  Scenario: US24_TC04_User should be able to find employees by search by Alphabet.
    When User navigates Find Employee tab
    And User clicks Search by Alphabet
    And User picks a letter to search an employee

  @REM-994 @sedat
  Scenario: US24_TC05_User should be able to export the employee list.
    When User navigates Find Employee tab
    And User clicks on More button
    And User clicks on Export to Excel

  @REM-997 @sedat
  Scenario: US24_TC06_User should be able to display telephone directory
    When User navigates Telephone Directory tab
    Then User should be able display Telephone Directory page

  @REM-1002 @sedat
  Scenario: US24_TC07_User should be able to send message to employee from the telephone directory
    When User navigates Telephone Directory tab
    And User selects an employee to display send message option


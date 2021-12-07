Feature: Employee module search functionality

  Scenario Outline: Searching for user by using search box
    Given User is on the login page
    And The user logs in with "hr" username and "UserUser" password
    When User navigates to Employee module from left side menu
    When User navigates Find Employee tab
    And User writes an "<employee name>" in search box
    Then User clicks search button
    Examples:
      | employee name |
      | Nadir         |
      | Asiya         |
      | Bekir         |
      | Eric          |
Feature: Employee module search functionality


  @REM-986 @sedat
  Scenario Outline: US24_TC03_User should be able to find employees by search box.
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
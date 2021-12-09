Feature: the user should be able to use "Filter and search" functionality

  Background: Login with HR credentials
    Given The user logged in
    When the user on the Filter and Search button

    @filter
    Scenario: User should be able to see default filters
      Then Verify that the user should be able to see default filters
      |WORK|
      |FAVORITES|
      |MY ACTIVITY|
      |ANNOUNCEMENTS|
      |WORKFLOWS|

  Scenario:User should be able to add and remove field.
    Then the user enter add field
    And the user should see seven item
      | Date      |
      | Type      |
      | Author    |
      | To        |
      | Favorites |
      | Tag       |
      | Extranet  |
    And the user add and remove

  Scenario:User should be able to search by selecting Date
    Then the user enter date
    And the user should see fourteen item
      | Any date        |
      | Yesterday       |
      | Current day     |
      | This week       |
      | This month      |
      | Current quarter |
      | Last 7 days     |
      | Last 30 days    |
      | Last 60 days    |
      | Last 90 days    |
      | Last N days     |
      | Month           |
      | Quarter         |
      | Year            |

    And the user select anyone
    And the user click search

  Scenario:User should be able to restore default field
    Then the user should see four fields
      | Date      |
      | Type      |
      | Author    |
      | To        |
    And the user enter add any field
    And the user click restore default fields

    @smoke
    Scenario: User should be able to save filter
      And the user click on the Save Filter button
      And the user write a filter name
      And the user click on the save button
      Then Verify that the user can saved a filter
Feature: the user should be able to use "Filter and search" functionality

  Background: Login with HR credentials
    Given The user logged in

    @filter
    Scenario: User should be able to see default filters
      When the user on the Filter and Search button
      Then Verify that the user should be able to see default filters
      |WORK|
      |FAVORITES|
      |MY ACTIVITY|
      |ANNOUNCEMENTS|
      |WORKFLOWS|
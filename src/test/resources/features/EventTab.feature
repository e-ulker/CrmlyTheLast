Feature: Creating Event
  Background: Login with HR credentials
    Given The user logged in
  @aet
  Scenario: User should be able to edit the event time
    When user clicks on Event Tab
    And user edit the starting date
    And user edit the starting time
    And user edit the ending date
    And user edit ending time
    When user clicks Specify time zone
    And user edit time zone
  @aet
  Scenario: User should be able to set a reminder
    When user clicks on Event Tab
    When user verify set reminder button is clicked
    And user edit time
    And user select measure of time
  @aet
  Scenario: User should be able to select event location from the dropdown
    When user clicks on Event Tab
    When user select event location
  @aet
  Scenario: User should be able to add attendees by selecting contacts individually or adding groups and departments
    When user clicks on Event Tab
    When user clicks Add persons, groups and department
    And user select individuals or groups and department
    And user clicks close button
    Then user verifies members are added
  @aet
  Scenario: User should be able edit event details
    When user clicks on Event Tab
    When user clicks more to see the details
    And user edits Availability
    And user edits Repeat
    And user edits Calendar
    And user edits Importance
  @aet
  Scenario: User should be able to send messages
    When user clicks on Event Tab
    When user clicks SEND button
    Then user verifies

Feature: open calendar

  Background:
    Given user should be able to login as "humanResource" successfully
    And the user click the company
    When the user click the add news button
    Then The preview text open
  @REM-993 @slh
  Scenario: type date into date inputBox
    When write any date to date inputBox "MM/dd/yyyy"

  @REM-996 @slh
  Scenario: verify to be shown actual date on calendar
    When click select date icon
    And verify actual day is selected "dd"
    And verify actual month is selected "MM"
    And verify actual year is selected "yyyy"

  @REM-999 @slh
  Scenario Outline: choose <month>
    When click select date icon
    And click the month dropDawn menu
    When user should be able to select a "<month>"

    Examples:
      | month     |
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

  @REM-1001 @slh
  Scenario Outline: choose <year>
    When click select date icon
    And click the year dropDawn menu
    When user should be able to select "<year>"

    Examples:
      | year |
      | 2024 |
      | 2023 |
      | 2022 |
      #| 2021 |
      | 2020 |
      | 2019 |
      | 2018 |

  @REM-1004 @slh
  Scenario: choose day
    When click select date icon
    Then choose a day

  @REM-1005 @slh
  Scenario: set time
    When click select date icon
    Then click Set Time icon
    And user should be able to set hour
    Then user should be able to set minute
    And user should be able to set AM_PM

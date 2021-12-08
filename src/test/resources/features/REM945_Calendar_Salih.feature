
Feature: open calendar

  Background:
    Given the user login in as "human_Resource_username"
    And the user click the company
    When the user click the add news button
    Then The preview text open
  @REM-841 @wip
  Scenario: type date into date inputBox
    When write any date to date inputBox "MM/dd/yyyy"

  @REM-842 @wip
  Scenario: verify to be shown actual date on calendar
    When click select date icon
    And verify actual day is selected "dd"
    And verify actual month is selected "MM"
    And verify actual year is selected "yyyy"

  @REM-843 @wip
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

  @REM-844 @wip
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

  @REM-845 @wip
  Scenario: choose day
    When click select date icon
    Then choose a day

  @REM-846 @wip
  Scenario: set time
    When click select date icon
    Then click Set Time icon
    And user should be able to set hour
    Then user should be able to set minute
    And user should be able to set AM_PM
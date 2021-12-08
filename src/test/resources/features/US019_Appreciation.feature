@run
Feature:create a quote


   # Given the user should be able login
  Background:
    Given  user should be able to login as "humanResource" successfully

  Scenario: user should open Appreciation window
    When the user clickss the MORE button
    And the user clickss the Appreciation button
    Then Appreciation window is displayed

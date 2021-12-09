
Feature:create a quote


   # Given the user should be able login
  Background:
    Given  user should be able to login as "humanResource" successfully

  #First Scenario:
  Scenario: user should open Appreciation window
    When the user clickss the MORE button
    And the user clickss the Appreciation button
    Then Appreciation window is displayed


  @run
    #AC04
  Scenario: Verify that users should be added by selecting multiple contacts from Employees and Departments contact lists
    When User clicks Appreciation subheading from More tabb
    And User clicks Employees and departments Tab after clicking Add Moree
    And User select the multiple contacts from listt
      | hr86@cybertekschool.com |
      | hr84@cybertekschool.com |
      | hr85@cybertekschool.com |
    Then User should be able to see selected contacts in To: input boxx
      | hr86@cybertekschool.com |
      | hr84@cybertekschool.com |
      | hr85@cybertekschool.com |



Feature:create a quote


   # Given the user should be able login
  Background:
    Given  user should be able to login as "humanResource" successfully

  #First Scenario:
  Scenario: user should open Appreciation window
    When the user clickss the MORE button
    And the user clickss the Appreciation button
    Then Appreciation window is displayed



    #TC04
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


  @run
    #TC05
  Scenario Outline: Verify that attach a link that have link text & link URL by clicking on the link icon.
    When User clicks Appreciation subheading from More tabb
    And User clicks link icon
    And User enters link text "<LinkText>" and link URL "<LinkURL>"
    And User clicks Save button
    Then User should see attached link which has only Link URL or LinkText and URL "<LinkText>" "<LinkURL>"
    Examples:
      | LinkText | LinkURL                  |
     #| google   | https://www.google.com/  |
      |          | https://www.google.com/  |
      #| hotmail  | https://www.hotmail.com/ |


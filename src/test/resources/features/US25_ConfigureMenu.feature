@all
Feature: Configure Menu
  Agile Story: As a user, I should be able to configure menu;
  so that I can edit the menu options for quick access to custom menu

  Background:
    Given  user should be able to login as "humanResource" successfully

  Scenario: User should see the menu pop up - AC1
    When the user clicks configure menu option
    Then menu pop up should be display


  Scenario: User should see the right options inside the configuration menu pop up -AC1
    When the user clicks configure menu option
    Then the system should display following options inside the configuration pop up window
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |


  Scenario: User should see selected checkbox as a default -AC1
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    Then "Add custom menu item" window should be display
    And  verify "open new tab" checkbox is selected as a default


  Scenario: User should add custom menu -AC1
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "www.google.com"
    Then hit the "Add" button on the add custom menu window
    And  verify "Google" custom menu is displayed on the menu items


  Scenario: User should NOT add new custom menu which is same already exist one -AC1
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "www.google.com"
    Then hit the "Add" button on the add custom menu window
    Then the system should display a window which has "This page has already been added to Favorites." message


  Scenario Outline: User should NOT add new custom menu if s/he lefts input box blank -AC1
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "<name>" to redirect "<link>"
    Then hit the "Add" button on the add custom menu window
    Then the input boxes should return to red color
    Examples:
      | name    | link           |
      | YouTube |                |
      |         | www.amazon.com |
      |         |                |


  Scenario: User should open custom menu link in a new tab AC-2
    When user clicks created custom menu which is "Google"
    Then custom menu link should be open in a new tab


  Scenario: User should see the options -AC2
    When user hover over to created menu which is "Google"
    And  clicks to pen sign
    Then system should display the items
      | Hide item          |
      | Delete custom item |
      | Edit               |
      | Rearrange          |

  @nur
    Scenario: User should see the edit custom menu -AC2
      When user hover over to created menu which is "Google"
      And  clicks to pen sign
      And  clicks to "Edit" item
      Then system should display "Edit custom menu item" window



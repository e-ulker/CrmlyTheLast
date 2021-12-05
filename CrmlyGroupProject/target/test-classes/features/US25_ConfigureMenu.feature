@nur
Feature: Configure Menu
  Agile Story: As a user, I should be able to configure menu;
  so that I can edit the menu options for quick access to custom menu

  Background:
#    Given the user logged in as "HR"
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
    And  user adds custom menu as "Google" to redirect "google.com"
    Then hit the "Add" button on the add custom menu window
    And  verify "Google" custom menu is displayed on the menu items

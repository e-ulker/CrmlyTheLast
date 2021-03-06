@all
Feature: Configure Menu
  Agile Story: As a user, I should be able to configure menu;
  so that I can edit the menu options for quick access to custom menu

  Background:
    Given  user should be able to login as "humanResource" successfully

  @REM-1010 @firstPart
  Scenario: User should see the menu pop up - AC1 //tc1
    When the user clicks configure menu option
    Then menu pop up should be display


  @REM-1011 @firstPart
  Scenario: User should see the right options inside the configuration menu pop up -AC1 //tc2
    When the user clicks configure menu option
    Then the system should display following options inside the configuration pop up window
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |


  @REM-1012 @firstPart
  Scenario: User should see selected checkbox as a default -AC1 //tc3
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    Then "Add custom menu item" window should be display
    And  verify "open new tab" checkbox is selected as a default



  @REM-1013 @firstPart
  Scenario: User should add custom menu -AC1 //tc4
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "google.com"
    Then hit the "Add" button on the add custom menu window
    And  verify "Google" custom menu is displayed on the menu items
    And the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up






  @REM-1014 @firstPart
  Scenario: User should NOT add new custom menu which is same already exist one -AC1 //tc5
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "google.com"
    Then hit the "Add" button on the add custom menu window
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "google.com"
    Then hit the "Add" button on the add custom menu window
    Then the system should display a window which has "This page has already been added to Favorites." message

    And the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up





  @REM-1015 @secondPart @again
  Scenario Outline: User should NOT add new custom menu if s/he lefts input box blank -AC1 //TC05
    When the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "<name>" to redirect "<link>"
    Then hit the "Add" button on the add custom menu window
    Then the input boxes should return to red color
    Examples:
      | name    | link       |
      | YouTube |            |
      |         | amazon.com |
      |         |            |



  @REM-1016 @secondPart
  Scenario: User should open custom menu link in a new tab -AC2 //TC7
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "google.com"
    And hit the "Add" button on the add custom menu window

    When user clicks created custom menu which is "Google"
    Then custom menu link should be open in a new tab

    And switch to previous page
    And the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up






  @REM-1017 @secondPart
  Scenario: User should see the options -AC4 //TC08
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "google.com"
    And hit the "Add" button on the add custom menu window

    When user hover over to created menu which is "Google"
    And  clicks to pen sign
    Then system should display the items
      | Hide item          |
      | Delete custom item |
      | Edit               |
      | Rearrange          |

    And the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up





  @REM-1018 @secondPart
  Scenario: User should see the edit custom menu -AC4
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "google.com"
    And hit the "Add" button on the add custom menu window

    When user hover over to created menu which is "Google"
    And  clicks to pen sign
    And  clicks to "Edit" item
    Then system should display "Edit custom menu item" window

    And the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up






  @REM-1019 @secondPart
  Scenario: User should edit custom menu  -AC4
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "Google" to redirect "google.com"
    And hit the "Add" button on the add custom menu window

    When user hover over to created menu which is "Google"
    And  clicks to pen sign
    And  clicks to "Edit" item
    And  user changes "Google" to "YouTube" inside the name input box
    And  user changes "google.com" to "youtube.com" inside the link box
    And  clicks to "Save" button inside the edit custom menu window
    Then verify "YouTube" custom menu is displayed on the menu items

    And the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up






  @REM-1020 @secondPart
  Scenario: User should be hide custom menu item  -AC5
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "YouTube" to redirect "youtube.com"
    And hit the "Add" button on the add custom menu window

    When user hover over to created menu which is "YouTube"
    And  clicks to pen sign
    And  clicks to "Hide item" item
    Then verify "YouTube" custom menu item is not displayed

    And the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up






  @REM-1021 @thirdPart
  Scenario: User should be see the hidden pop up window -AC6
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "YouTube" to redirect "youtube.com"
    And hit the "Add" button on the add custom menu window
    And user hover over to created menu which is "YouTube"
    And  clicks to pen sign
    And  clicks to "Hide item" item

    When user clicks to more option
    Then the hidden window should be display

    And  the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up







  @REM-1022 @thirdPart
  Scenario: User should be see the default hidden items -AC6
    When user clicks to more option
    Then user should be able to see default options
      | Applications |
      | Workflows    |







  @REM-1023 @thirdPart
  Scenario: User should be able to show the custom item -AC7
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "YouTube" to redirect "youtube.com"
    And hit the "Add" button on the add custom menu window
    And user hover over to created menu which is "YouTube"
    And  clicks to pen sign
    And  clicks to "Hide item" item

    When user clicks to more option
    When user hovers over to created menu which is "YouTube"
    And  clicks to hidden pen sign
    And  clicks to "Show item" item
    Then verify "YouTube" custom menu item is not hidden window

    And  the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up








  @REM-1025 @thirdPart
  Scenario: User should be able to see "Delete custom item" window on the screen -AC3
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "YouTube" to redirect "youtube.com"
    And hit the "Add" button on the add custom menu window

    When user hovers over to created menu which is "YouTube"
    And  clicks to pen sign
    And  clicks to "Delete custom item" item
    Then user should be able to see the the Delete custom item window is displayed

    And  user clicks "Delete" button







  @REM-1026 @onlyOne @thirdPart
  Scenario: User should be able to delete the created custom item -AC3
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "YouTube" to redirect "youtube.com"
    And hit the "Add" button on the add custom menu window

    When user hovers over to created menu which is "YouTube"
    And  clicks to pen sign
    And  clicks to "Delete custom item" item
    And  user clicks "Delete" button
    Then verify created "YouTube" custom menu is not visible on the screen







  @REM-1027 @thirdPart
  Scenario: User should can reset the menu
    Given the user clicks configure menu option
    And  the user hits "Add custom menu item" option from the menu pop up
    And  user adds custom menu as "YouTube" to redirect "youtube.com"
    And hit the "Add" button on the add custom menu window

    When the user clicks configure menu option
    And  the user hits "Reset menu" option from the menu pop up
    And  user accepts the pop up
    Then verify system displays menu items
      | Activity Stream  |
      | Tasks            |
      | Chat and Calls   |
      | Workgroups       |
      | Drive            |
      | Calendar         |
      | Mail             |
      | Contact Center   |
      | Time and Reports |
      | Employees        |
      | Services         |
      | Company          |



Feature: Assign tasks under Quick Navigate Menu
  @REM-988 @smoke @selcan
  Scenario: US16-TC01S-User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the High Priority checkbox
    And Verify the checkbox is selected
  @REM-991 @selcan
  Scenario: US16-TC02S-User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the Visual Editor
    And Verify textbar is displayed
  @REM-992 @selcan
  Scenario: US16-TC03S-User can add a checklist item by clicking on the add button or checkmark.
    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And Write inside the Things to do box
    And Click on the check sign
    Then Verify a checklist item is added
  @REM-995 @selcan
  Scenario: US16-TC04S-User can add separator lines between checklist items.
    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And  Things to do box is opened
    And Write inside the Things to do box
    Then Click on the check sign
    And Click on the seperator
    Then Verify  the seperator is added
  @REM-998 @selcan
  Scenario: US16-TC05S-User can delete a checklist item
    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And  Things to do box is opened
    And Write inside the Things to do box
    Then Click on the check sign
    And Click on the checkbox near checklist
    Then Verify the checklist item is deleted
  @REM-1000 @selcan
  Scenario: US16-TC06S-User can add Deadline, Time Planning by using date pickers.
    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then Click on the title button
    And Write inside the title
    And Click on the Add Task button
    Then Verify Task is added
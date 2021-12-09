Feature: Assign tasks under Quick Navigate Menu

  Scenario: the user click on the High Priority checkbox


    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the High Priority checkbox
    And Verify the checkbox is selected

  Scenario: User click on Visual Editor and see the editor text bar

    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the Visual Editor
    And Verify textbar is displayed

  Scenario: the user can add a checklist item

    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And Write inside the Things to do box
    And Click on the check sign
    Then Verify a checklist item is added

  Scenario: the user can add separator lines

    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And  Things to do box is opened
    And Write inside the Things to do box
    Then Click on the check sign
    And Click on the seperator
    Then Verify  the seperator is added

  Scenario: The user can delete a checklist item

    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the checklist
    And  Things to do box is opened
    And Write inside the Things to do box
    Then Click on the check sign
    And Click on the checkbox near checklist
    Then Verify the checklist item is deleted
@selcan
  Scenario: The user can add a task

    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then Click on the title button
    And Write inside the title
    And Click on the Add Task button
    Then Verify Task is added
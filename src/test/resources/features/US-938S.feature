Feature: Assign tasks under Quick Navigate Menu

  Scenario: the user click on the High Priority checkbox


    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the High Priority checkbox
    And Verify the checkbox is selected
  @selcan
  Scenario: User click on Visual Editor and see the editor text bar

    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the Visual Editor
    And Verify textbar is displayed


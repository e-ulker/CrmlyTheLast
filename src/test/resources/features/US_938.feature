Feature: Assign tasks under Quick Navigate Menu
  @selcan
  Scenario: the user click on the High Priority checkbox


    Given The user logged in
    When the user click on Tasks
    And the user click on New Task
    Then the user click on the High Priority checkbox
    And Verify the checkbox is selected


Feature: select the type of information

  Background:
    Given user should be able to login as "humanResource" successfully
    And the user click the company
    When the user click the add news button
    Then The preview text open


  @REM-990 @slh
  Scenario Outline: select <typeOfInformation>
    #Given click the news dropdawn menu icon
    When user should be able to choose "<typeOfInformation>"

    Examples:
      | typeOfInformation |
      | (not set)         |
      | Announcement      |
      | General info      |
      | News              |
      | Notice            |
      | Order             |
      | Portal News       |
      | Press Release     |



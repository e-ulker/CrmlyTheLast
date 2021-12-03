Feature: Sending Poll

  Scenario: (Negative) Not sending Poll without correct URL

    Given user should be able to login as "helpDesk" successfully
    When user clicks poll tab under Activity Stream
    And user clicks Link icon symbol under text area
    Then user should not be able to add URL without two dots and "www"

  Scenario: (Negative) Not sending Poll minimum two answer options

    Given user should be able to login as "HR" successfully
    When user clicks poll tab under Activity Stream
    And user writes its question on question inputbox
    Then user should not be able to add poll without minimum answer options

  Scenario: (Negative) Not sending Poll minimum two answer options

    Given user should be able to login as "HR" successfully
    When user clicks poll tab under Activity Stream
    And user writes its question on question inputbox
    Then user should not be able to send poll with same question asked before

  Scenario: Adding users by multiple contacts from contact lists.

    Given user should be able to login as "HR" successfully
    When user clicks poll tab under Activity Stream
    Then user should be able to select multiple contacts from contact lists.

  Scenario: Adding questions and multiple answers.

    Given user should be able to login as "HR" successfully
    When user clicks poll tab under Activity Stream
    Then user should be able to add questions and multiple answers.




Feature: Users should be able to login

  Scenario Outline: Login as a "<user>"
    Given user should be able to login as "<user>" successfully

    Examples:

      | user          |
      | helpDesk      |
      | humanResource |
      | marketing     |
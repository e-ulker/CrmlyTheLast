Feature: As a user, I can use Applications menu

  @done
  Scenario Outline: "<user>"  should be able to display the new applications
    Given user should be able to login as "<user>" successfully
    When user should be able to click "Applications"
    Then user should be able to display the new applications

    Examples:
      | user          |
      | helpDesk      |
      | humanResource |
      | marketing     |

  @done
  Scenario Outline: "<user>" should be able to send a request for installing if there is no permission for installing
    Given user should be able to login as "<user>" successfully
    When user should be able to click "Applications"
    And user should be able to click VIEW
    And user should be able to click INSTALL
    Then user should be able to send a request for installing

    Examples:
      | user          |
      | helpDesk      |
      | humanResource |
      | marketing     |

  @done
  Scenario Outline: "<user>" should be able to display the application's features
    Given user should be able to login as "<user>" successfully
    When user should be able to click "Applications"
    And user should be able to click VIEW
    Then user should be able to display the application's features
      | Description |
      | Versions    |
      | Support     |
      | Install     |

    Examples:
      | user          |
      | helpDesk      |
      | humanResource |
      | marketing     |

  @done
  Scenario Outline: "<user>"  should be able to display 'Marketplace','Installed' and 'Webhooks' on the Application Page
    Given user should be able to login as "<user>" successfully
    When user should be able to click "Applications"
    Then user should be able to display
      | Marketplace |
      | Installed    |
      | Webhooks    |

    Examples:
      | user          |
      | helpDesk      |
      | humanResource |
      | marketing     |

Feature: Services Functionality
  Background:login as humanResource
    Given user should be able to login as "humanResource" successfully

  Scenario: User should be use new idea functionality
    Given user should be click the services
    When user should be able to click ideas
    When user should be able to click new idea button
    Then user should enter the title "Title123",idea "Text123@"
    Then verify the idea on the ideas page title "Title123",idea "Text123@"

   Scenario: User can dislike the any idea
     Given user should be click the services
     When user should be able to click ideas
     Then user should be dislike the any idea

   Scenario: User can like the any idea
     Given user should be click the services
     When user should be able to click ideas
     Then user should be like the any idea

   Scenario: User can sort the ideas
     Given user should be click the services
     When user should be able to click ideas
     Then user should be sort the date
  @osman
  Scenario: User can sort the ideas
    Given user should be click the services
    When user should be able to click ideas
    Then user should be sort the rating
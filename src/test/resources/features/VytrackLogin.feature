Feature: Vytrack Login feature

  As a user I should be able to login

  @wip
  Scenario: As a user I should be able to login with valid credentials
    Given User is on the Login Page
    When User enter valid username
    And User enter valid password
    And User click Login Button
    Then User should be able to see  "Dashboard" As Title
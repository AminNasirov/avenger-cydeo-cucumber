Feature: Calculator feature

  as user I should be able to use calculator


  Scenario: Add 2 numbers
    Given Calculator app is opened
    When user add 2 with 3
    Then User should see 5 as expected


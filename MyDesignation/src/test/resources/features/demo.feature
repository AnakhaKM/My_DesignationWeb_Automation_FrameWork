Feature: Validate functionality of flighting website
  Scenario: verify user can booking flight tickets
    Given user opens website
    Then  verify user is on homepage
    When  user clicks on login button
    And   user fills necessary credentials to login
    Then  verify user on home page
    When  user choose the departure and arriving details
    And  choose the flights available
    And  clicks on booking option
    Then  verify booking done successfully
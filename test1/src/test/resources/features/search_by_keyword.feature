Feature: Search by keyword 1
  Background:
    Given the users REST API

  Scenario: Searching for cucumber
    Given the users REST API
    When PUT is used
    Then the status code is 201
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"

  Scenario: Searching for cucumber3
    Given the users REST API
    When PUT is used
    Then the status code is 201
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"
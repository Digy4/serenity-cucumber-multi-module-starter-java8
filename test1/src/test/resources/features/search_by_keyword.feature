Feature: Search by keyword 1

  Scenario: Searching for cucumber
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"
    Given the users REST API
    When PUT is used
    Then the status code is 201

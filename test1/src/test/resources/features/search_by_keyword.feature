Feature: Search by keyword 1

  Scenario: Searching for cucumber
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"

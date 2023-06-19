Feature: Search by keyword 2

  Scenario: Searching for Wikipedia
    Given Sergey is researching things on the internet
    When he looks up "Wikipedia"
    Then he should see information about "Wikipedia"

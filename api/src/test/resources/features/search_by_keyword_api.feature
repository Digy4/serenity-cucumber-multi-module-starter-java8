Feature: Search by keyword

  Scenario: API test
    Given the users REST API
    When PUT is used
    Then the status code is 201
    When GET is used
    Then the status code is 200

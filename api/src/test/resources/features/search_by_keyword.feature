Feature: Digy4 API test

  Scenario: Call Petstore APIs
    Given Kitty is available in the pet store
    When I ask for a pet using Kitty's ID
    Then I get Kitty as result

  Scenario: Call Petstore APIs Fail
    Given Kitty is available in the pet store
    When I ask for a pet using Kitty's ID
    Then I did not Kitty as result
@Test

Feature: Error Test Cases


  Scenario: Login User with invalid Credentials

    Given User is on Orange HRM Page
    When User enter invalid username "invalid" and password "invalid"
    When User click Login
    Then An Error Message should be displayed
Feature: SignUp
  Scenario: Sign up to Farmdrop
    Given I am on farmdrop's signup page
    When I enter my details
    And click the submit button
    Then I am logged in to my city's instance of Farmdrop

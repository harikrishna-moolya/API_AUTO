@integration
Feature: API and UI User Validation Sync

  Scenario: Non-existing user lookup should match UI login error
    When I get user details using email "hk18@gmail.com"
    Then the status code should be 404
    And the response should contain "Account not found"

    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "Hari@0577"
    And I click login button
    Then I should stay on login page with error message

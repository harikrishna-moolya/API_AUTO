@integration
Feature: User Deletion Impact on UI and API

  Scenario: Deleted user should not authenticate via UI or API
    When I delete user with email "hk18@gmail.com" and password "Hari@0577"
    Then the status code should be 404
    And the response should contain "Account not found"

    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "Hari@0577"
    And I click login button
    Then I should stay on login page with error message

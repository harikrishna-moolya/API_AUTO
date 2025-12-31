@integration
Feature: Login UI and API Error Consistency

  Scenario: Failed login in UI should match API failure response
    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "WrongPass123"
    And I click login button
    Then I should stay on login page with error message

    When api I login using email "hk18@gmail.com" and password "hk"
    Then the status code should be 404
    And the response should contain "User not found"


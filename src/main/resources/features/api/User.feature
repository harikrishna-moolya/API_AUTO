@api
Feature: User API Testing
@api

  Scenario: Login with invalid credentials
    When api I login using email "hk18@gmail.com" and password "Hari@0577"
    Then the status code should be 404
    And the response should contain "User not found"
  @api
  Scenario: Get user details for non-existing email
    When I get user details using email "hk18@gmail.com"
    Then the status code should be 404
    And the response should contain "Account not found"

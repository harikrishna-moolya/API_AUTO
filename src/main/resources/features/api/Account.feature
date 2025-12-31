@api
Feature: Account Management

  Scenario: Delete a user account
    When I delete user with email "hk18@gmail.com" and password "Hari@0577"
    Then the status code should be 404
    And the response should contain "Account not found"


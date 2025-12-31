@e2e
Feature: Guest checkout redirection

  Scenario: Guest user is forced to login when checking out
    When I get user details using email "hk18@gmail.com"
    Then the status code should be 404
    And the response should contain "Account not found"

    When I go to products page
    And I add first product to cart
    And I continue shopping
    And I open cart page
    And I click checkout on cart page
    And I choose to login from checkout page
    Then I am on login page

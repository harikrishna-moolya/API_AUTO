@e2e
Feature: Forced login during checkout

  Scenario: User is redirected to login when trying to checkout without active session
    When I get user details using email "hk18@gmail.com"
    Then the status code should be 404
    And the response should contain "Account not found"

    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "Hari@0577"
    And I click login button

    And I go to products page
    And I add first product to cart
    And I continue shopping
    And I open cart page

    Then I should see at least one product in cart

    When I click checkout on cart page
    And I choose to login from checkout page

    Then I am on login page

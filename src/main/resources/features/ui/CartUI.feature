@UI
Feature: Cart operations

  Scenario: Add product and open cart
    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "Hari@0577"
    And I click login button
    And I go to products page
    And I add first product to cart
    And I continue shopping
    And I open cart page
    Then I should see at least one product in cart
# Adding new feature


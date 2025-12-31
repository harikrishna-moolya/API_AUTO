#@UI
#Feature: Checkout navigation
#
#  Scenario: Complete checkout navigation
#    Given I am on login page
#    When I enter login email "hk18@gmail.com"
#    And I enter login password "Hari@0577"
#    And I click login button
#    And I go to products page
#    And I add first product to cart
#    And I continue shopping
#    And I open cart page
#    And I click checkout on cart page
#   Then I will be in same page
##Adding new feature
#  @UI
#  Scenario: Checkout prompts login for guest users
#    When I open products page
#    And I add first product to cart
#    And I go to cart page
#    And I click checkout on cart page
#    Then I should see login popup on checkout
@UI
Feature: Checkout navigation

  Scenario: Logged-in user proceeds to checkout successfully
    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "Hari@0577"
    And I click login button
    And I go to products page
    And I add first product to cart
    And I continue shopping
    And I open cart page
    And I click checkout on cart page
    Then I should be on checkout page
  @UI
  Scenario: Guest user is asked to login at checkout
    When I go to products page
    And I add first product to cart
    And I continue shopping
    And I open cart page
    And I click checkout on cart page
    And I choose to login from checkout page
    Then I am on login page

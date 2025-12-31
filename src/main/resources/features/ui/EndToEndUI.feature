#@UI
#Feature: End to End UI Test (Products → Cart → Checkout → Login)
#
#  Scenario: Complete user flow without clicking Products menu
#    When I open products page
#    And I add first product to cart
#    And I continue shopping after adding product
#    And I go to cart page
#    And I click checkout on cart page
#    And I choose to login from checkout page
#    And I login using email "hk18@gmail.com" and password "Hari@0577"
#    Then I should reach homepage after login
##Adding new feature
#  @UI
#  Scenario: Complete E2E flow with login from checkout
#    When I open products page
#    And I add first product to cart
#    And I continue shopping after adding product
#    And I go to cart page
#    And I click checkout on cart page
#    And I choose to login from checkout page
#    And I login using email "hk18@gmail.com" and password "Hari@0577"
#    Then I should reach homepage after login
#   #adding new test cases
#  @UI
#  Scenario: Complete E2E flow with multiple products added to cart
#    When I open products page
#    And I add first product to cart
#    And I continue shopping after adding product
#    And I add first product to cart
#    And I continue shopping after adding product
#    And I go to cart page
#    And I click checkout on cart page
#    And I choose to login from checkout page
#    And I login using email "hk18@gmail.com" and password "Hari@0577"
#    Then I should reach homepage after login
#
#  @UI
#  Scenario: Complete E2E flow with verifying cart before checkout
#    When I open products page
#    And I add first product to cart
#    And I continue shopping after adding product
#    And I go to cart page
#    And I go to cart page
#    And I click checkout on cart page
#    And I choose to login from checkout page
#    And I login using email "hk18@gmail.com" and password "Hari@0577"
#    Then I should reach homepage after login
#
#  @UI
#  Scenario: Complete E2E flow with verifying cart before checkout
#    When I open products page
#    And I add first product to cart
#    And I continue shopping after adding product
#    And I go to cart page
#    And I go to cart page
#    And I click checkout on cart page
#    And I choose to login from checkout page
#    And I login using email "hk18@gmail.com" and password "Hari@0577"
#    And I go to products page
#    And I add first product to cart
#    And I continue shopping
#    And I open cart page
#    And I click checkout on cart page
#    Then I should be on checkout page
#
@UI
Feature: End-to-End UI Test Suite (Products → Cart → Checkout → Login)

  # ---------------------------------------------------------
  # SCENARIO 1 — Basic flow: Add → Cart → Checkout → Login
  # ---------------------------------------------------------
  Scenario: Basic checkout flow with login from checkout
    When I open products page
    And I add first product to cart
    And I continue shopping after adding product
    And I go to cart page
    And I click checkout on cart page
    And I choose to login from checkout page
    And I login using email "hk18@gmail.com" and password "Hari@0577"
    Then I should reach homepage after login


  # ---------------------------------------------------------
  # SCENARIO 2 — Multiple products added before checkout
  # ---------------------------------------------------------
  Scenario: Checkout with multiple products added to cart
    When I open products page
    And I add first product to cart
    And I continue shopping after adding product
    And I add first product to cart
    And I continue shopping after adding product
    And I go to cart page
    And I click checkout on cart page
    And I choose to login from checkout page
    And I login using email "hk18@gmail.com" and password "Hari@0577"
    Then I should reach homepage after login


  # ---------------------------------------------------------
  # SCENARIO 3 — Verify cart before checkout
  # ---------------------------------------------------------
  Scenario: Verify cart page before continuing to checkout
    When I open products page
    And I add first product to cart
    And I continue shopping after adding product
    And I go to cart page
    And I go to cart page
    And I click checkout on cart page
    And I choose to login from checkout page
    And I login using email "hk18@gmail.com" and password "Hari@0577"
    Then I should reach homepage after login


  # ---------------------------------------------------------
  # SCENARIO 4 — Add more items after login redirect
  # ---------------------------------------------------------
  Scenario: Add more products after returning from checkout
    When I open products page
    And I add first product to cart
    And I continue shopping after adding product
    And I go to cart page
    And I click checkout on cart page
    And I choose to login from checkout page
    And I login using email "hk18@gmail.com" and password "Hari@0577"
    And I go to products page
    And I add first product to cart
    And I continue shopping
    And I open cart page
    And I click checkout on cart page
    Then I should be on checkout page


  # ---------------------------------------------------------
  @UI
  Scenario: Add product and return to products before checking out
    When I open products page
    And I add first product to cart
    And I continue shopping after adding product
    And I open products page
    And I go to cart page
    And I click checkout on cart page
    And I choose to login from checkout page
    And I login using email "hk18@gmail.com" and password "Hari@0577"
    Then I should reach homepage after login



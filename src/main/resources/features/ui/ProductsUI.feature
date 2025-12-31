@UI
Feature: Add products

  Scenario: Add product to cart
    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "Hari@0577"
    And I click login button
    And I go to products page
    And I add first product to cart
    And I continue shopping
    Then I should remain on products page
#    Adding New Feature
  @UI
  Scenario: Verify products are displayed
    When I open products page
    Then I should see all product listings visible

  @UI
  Scenario: Stay on products page after loading
    When I open products page
    Then I should remain on products page

@integration
Feature: UI and API Product Sync

  Scenario: Product added to cart in UI should exist in API product list
    When I open products page
    And I add first product to cart
    And I continue shopping
    And I open cart page
    Then I should see at least one product in cart
    When I send GET request to "/api/productsList"
    Then the response should contain "products"

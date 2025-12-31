@integration
Feature: UI and API Product Search Sync

  Scenario: Searching for product keyword should match API search results
    When I open products page
    Then I should see all product listings visible
    When I search products with keyword "top"
    Then the status code should be 200
    And the response should contain "products"

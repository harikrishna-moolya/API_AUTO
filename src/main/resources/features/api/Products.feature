@api
Feature: Products API Testing
  @api
  Scenario: Get all products list (valid GET request)
    When I send GET request to "/api/productsList"
    Then the status code should be 200
    And the response should contain "products"
@api
  Scenario: Search product with valid keyword
    When I search products with keyword "top"
    Then the status code should be 200
    And the response should contain "products"
  @api
  Scenario: Search product with invalid keyword
    When I search products with keyword "xyz12345"
    Then the status code should be 200
    And the response should contain "products"
  @api
  Scenario: Search product without keyword
    When I search products with keyword ""
    Then the status code should be 200
    And the response should contain "products"
  @api
  Scenario: Get products list using POST method (not supported)
    When I send POST request to "/api/productsList"
    Then the status code should be 405
    And the response should contain "This request method is not supported"
  @api
  Scenario: Search product with special characters
    When I search products with keyword "@@@@"
    Then the status code should be 200
    And the response should contain "products"

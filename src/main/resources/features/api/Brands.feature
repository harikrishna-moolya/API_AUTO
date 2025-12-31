@api
Feature: Brands API Testing

  Scenario: Get all brands list (method not supported)
    When I send GET request to "/api/brandsList"
    Then the status code should be 200
    And the response should contain "brands"

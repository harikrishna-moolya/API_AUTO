@UI
Feature: Login UI

  Scenario: Login successfully
    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "Hari@0577"
    And I click login button
    Then I should be redirected to homepage
# Adding New Features
  @UI
  Scenario: Login with incorrect password
    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password "WrongPass123"
    And I click login button
    Then I should stay on login page with error message

  @UI
  Scenario: Login with empty email
    Given I am on login page
    When I enter login email ""
    And I enter login password "Hari@0577"
    And I click login button
    Then I should see email validation error


  @UI
  Scenario: Login with empty password
    Given I am on login page
    When I enter login email "hk18@gmail.com"
    And I enter login password ""
    And I click login button
    Then I should see password validation error

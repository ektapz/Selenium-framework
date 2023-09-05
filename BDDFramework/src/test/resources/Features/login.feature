
Feature: feature to test login functionality

  Scenario: check login is successful with valid credentials
    Given User is on login page
    When User enter username and password
    And Click on login button
    Then User is navigate to the login page

  

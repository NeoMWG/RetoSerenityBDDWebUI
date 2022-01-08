Feature: Login
  As a customer, I want to enter the Automationpractice.com platform and
  login to enter the shopping site


  Scenario: Successful login
    Given the client enters the landingPage of the website
    When When the client enters the Sign in section
    And fill in the login fields
    Then the user should see the login name at the top right of the screen


  Scenario: Failed login
    Given the client enters the home of the website
    When the user navigates to the login option
    And fill the fields incompletely
    Then the page should show you the login error message
Feature: Contact Us Form
  As a user of the website I want to enter the contact form so that can tell me more information about the products offered

  @active
  Scenario: Complete information of the form
    Given the user is on the home page of the automationpractice.com website
    When the user enters the contact us page
    And fill in the fields completely
    Then the user should be able to view a message indicating Your message has been successfully sent to our team

  @ignore
  Scenario:  Incomplete information of the form
    Given the user is on the home page of website
    When the user enters the contact us opction
    And fill in the fields incompletely
    Then the website will display an error message stating the cause
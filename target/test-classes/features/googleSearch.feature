
Feature: Google search functionality
  Agile story: AS a user, when i am on the google search page, I should be able to search whatever I want and see relevant information

Scenario: Search page title verification
  When user is on google search page
  Then user should see title is Google


  Scenario:Search functionality result title verification
    Given user is on google search page
    When user types apple and clicks enter
    Then user sees apple in the google title

  Scenario:Search functionality result title verification
    Given user is on google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title


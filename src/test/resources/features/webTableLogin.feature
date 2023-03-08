@smoke
Feature: USer should be able to login with correct credentials


  Scenario: Positive login scenario
    Given user is on the login pageof web table app
    When user enters username: "Test"
    And user enters password: "Tester"
    And user clicks the login button
    Then user should see url ends with orders

  Scenario:
    Given user is on the login pageof web table app
    When user enters username: "Test" password: "Tester" and logins
    Then user should see url ends with orders


  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January |
      | February |
      | March |
      | April |
      | May |
      | June |
      | July |
      | August |
      | September |
      | October |
      | November |
      | December |

  Scenario: User should be able to see all 12 months in
  months
  dropdown
    Given user is on the login pageof web table app
    When User enters below credentials
      | username | Test |
      | password | Tester |
    Then user should see url ends with orders




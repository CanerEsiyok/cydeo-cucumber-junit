@smoke
Feature: Wikipedia Search Functionality


  Background: For the scenarios on the feature files, the user is expected to be on Wikipedia home page
    Given user is on Wikipedia home page
@wip
  Scenario: Wikipedia Search Functionality Title Verification
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in the main header


  Scenario Outline: Wikipedia Search Functionality Title Verification
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedTitle>" is in the wiki title
    Then user sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to use in this scenario are as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Kate Winslet      | Kate Winslet      | Kate Winslet       |
      | Lady Gaga         | Lady Gaga         | Lady Gaga          |





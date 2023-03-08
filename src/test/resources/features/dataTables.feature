Feature: Examples of Cucumber data table implementations
@wip @smoke
  Scenario: List of fruits I like
    Then user should see the fruits I like
      | kiwi       |
      | banana     |
      | orange     |
      | mango      |
      | grape      |
      | strawberry |
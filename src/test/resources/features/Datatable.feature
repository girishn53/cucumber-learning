@third
Feature: This file is showing concept of datatables

  Scenario: Working with data tables
    Given I login to website
    When user selects the age category
      | age      | location |
      | above 18 | Noida    |
      | below 18 | Delhi    |

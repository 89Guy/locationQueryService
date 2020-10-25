Feature: Fill inputform using CSV and Background

  Background:
    Given input form to fill up the Data

    @tag1
  Scenario: Reading data from CSV for user01 using background,please search for value in double quotes,csv fileName and bean name should be same
    When user fillsup the form with all required information for user "user01" using "csv"
    Then user should be registered

  Scenario: Reading data from CSV for user02  using background,please search for value in double quotes,csv fileName and bean name should be same
    When user fillsup the form with all required information for user "user02" using "csv"
    Then user should be registered
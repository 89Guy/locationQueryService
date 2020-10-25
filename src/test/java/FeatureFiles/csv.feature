Feature: Fill inputform using CSV

  Scenario: Reading data from CSV for user01,please search for value in double quotes,csv fileName and bean name should be same

    Given input form to fill up the Data
    When user fillsup the form with all required information for user "user01" using "csv"
    Then user should be registered

  Scenario: Reading data from CSV for user02,please search for value in double quotes,csv fileName and bean name should be same

    Given input form to fill up the Data
    When user fillsup the form with all required information for user "user02" using "csv"
    Then user should be registered

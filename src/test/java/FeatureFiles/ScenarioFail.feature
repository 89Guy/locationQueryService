Feature: Fill inputform using CSV scenarioFailure

  Scenario: Reading data from CSV  scenarioFailure for user01,please search for value in double quotes,csv fileName and bean name should be same

    Given input form to fill up the Data
    And input null value
    When user fillsup the form with all required information for user "user01" using "csv"
    Then user should be registered
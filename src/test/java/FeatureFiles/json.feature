Feature: Fill inputform using Json

  Scenario: Reading data from Json for user01,please search for value in double quotes,json fileName and bean name should be same

    Given input form to fill up the Data
    When user fillsup the form with all required information for user "user01" using "json"
    Then user should be registered

  Scenario: Reading data from Json for user02,please search for value in double quotes,json fileName and bean name should be same

    Given input form to fill up the Data
    When user fillsup the form with all required information for user "user02" using "json"
    Then user should be registered

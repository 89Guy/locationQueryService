Feature: Fill inputform using DataTableListOfList

  Scenario: Reading data from CSV for user01|please search for value in double quotes|csv fileName and bean name should be same

    Given input form to fill up the Data
    When user fillsup the form with all required information for user using DataTablelistOfList
  |uniqueValue|firstName|lastName|email|phone|address|city|state|zipCode|websiteOrDomainName|hostingYes|projectDescription|
  |user01|John|Morrison|john.morrison@yahoo.com|1234567890|earth|Alaska|Alaska|112233|johnmorrison.com||Demo              |
    Then user should be registered
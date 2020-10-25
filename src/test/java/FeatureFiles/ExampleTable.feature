Feature: Fill inputform using ExampleTable

  Scenario Outline: Reading data from CSV for user01|please search for value in double quotes|csv fileName and bean name should be same

    Given input form to fill up the Data
    When user fillsup the form with all required information for user using exampleTable "<uniqueValue>" "<firstName>" "<lastName>" "<email>" "<phone>" "<address>" "<city>" "<state>" "<zipCode>" "<websiteOrDomainName>" "<hostingYes>" "<projectDescription>"
    Then user should be registered
    Examples:
      |uniqueValue|firstName|lastName|email|phone|address|city|state|zipCode|websiteOrDomainName|hostingYes|projectDescription|
      |user01|John|Morrison|john.morrison@yahoo.com|1234567890|earth|Alaska|Alaska|112233|johnmorrison.com||Demo              |
      |user02|John|Cena|john.cena@yahoo.com|1234567890|earth|Alaska|Alaska|112233|johncena.com||Demo              |
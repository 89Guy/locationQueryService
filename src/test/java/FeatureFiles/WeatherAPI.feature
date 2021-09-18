Feature: Fill inputform using Json

  Scenario: Reading data from Json for user01,please search for value in double quotes,json fileName and bean name should be same

    Given foreCast Weather API
    When user sends the request
    Then user should get a valid response with statuscode "200"

    Scenario: Location Search By Name
      Given user search a location by Name
      When user sends the request for location "london"
      Then user should get status code "200"
      And user should validate the response having location "london"

    Scenario: Where on earth ID
      Given user search a location by earth ID
      When user sends the request for earthID "44418"
      Then user should get status code "200"
      And user should validate the response having location "london"

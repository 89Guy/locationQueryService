Feature: Location Query Service API Validation

  Scenario: Request for Location Query Service API with valid MSDIN

    Given Location Query Service API
    When user sends the request with valid MSDIN
    Then user should get a valid response with statuscode "200"

    Scenario: Request for Location Query Service API with invalid MSDIN
      Given Location Query Service API
      When user sends the request with invalid MSDIN
      Then user should get a valid response with statuscode "200"

  Scenario: Request for Location Query Service API with invalid client
    Given Location Query Service API
    When user sends the request with invalid client
    Then user should get a valid response with statuscode "200"

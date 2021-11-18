Feature: TWG Loyalty


  @No_CustomerID
  Scenario:Null Customer id

    Given I has a request with null customer Id
    When I hit the post request
    Then I get a Error status codes
    And I get the Error message

  @Empty_StoreID
  Scenario: Passing empty storeID

    Given I has a request with empty storeid
    When I hit the post request
    Then I get a Error status for segments
    And I get the Error message for segments
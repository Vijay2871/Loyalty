Feature: TWG Loyalty

  Scenario: Create Segments for Give Back Offer

    Given I has a request with all fields
    When I has the post request
    Then I get a success status codes
    And I get the Success Response message
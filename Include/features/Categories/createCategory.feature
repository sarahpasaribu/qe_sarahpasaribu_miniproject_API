@tag
Feature: Create Category

 @createCategorySuccess
  Scenario Outline: Method POST create category Successfully
    Given Set create category method to POST-001
    When Set URL create category https://alta-shop.herokuapp.com/api/categories-001
    And Set body create category using Test Data-001 
    And Send create category Request-001
    Then Show create category the verify result 200 OK-001 
    
 @emptyBody
  Scenario Outline: Method POST create category Unsuccessfully
    Given Set create category method to POST-002
    When Set URL create category https://alta-shop.herokuapp.com/api/categories-002
    And Set create category body using Test Data-002
    And Send create category Request-002
    Then Show create category the verify result 400 BAD REQUEST-002


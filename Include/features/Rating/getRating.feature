@tag
Feature: Get Product Rating

 @getRatingProductSuccessful
  Scenario Outline: Method POST getRating product unsuccessfully
    Given Set getRating product method to POST-001
    When Set URL getRating product https://alta-shop.herokuapp.com/api/products/2/ratings-001
    And Send getRating Request-001
    Then Show getRating product the verify result 200 OK-001


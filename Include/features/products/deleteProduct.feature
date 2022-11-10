@tag
Feature: Title of your feature


 @deleteProduct
  Scenario Outline: Method POST deleteProduct successfully
    Given Set method deleteProduct to POST-001
    When Set URL deleteProduct https://alta-shop.herokuapp.com/api/products/10-001
    And Send Request deleteProduct-001
    Then Show the verify result deleteProduct 200 OK-001



 @deleteProductInvalid
  Scenario Outline: Method POST deleteProduct Unsuccessfully
    Given Set method deleteProduct to POST-002
    When Set URL deleteProduct https://alta-shop.herokuapp.com/api/products-002
    And Send Request deleteProduct-002
    Then Show the verify result deleteProduct 500 Internal Server Error OK-002
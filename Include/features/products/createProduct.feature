@tag
Feature: Create a new Product

 @createProductSuccessfully
  Scenario Outline: Method POST createProduct Successfully
    Given Set method createProduct to POST-001
    When Set URL createProduct https://alta-shop.herokuapp.com/api/products-001
    And Set body createProduct using Test Data-001 
    And Send Request createProduct-001
    Then Show the verify result createProduct 200 OK-001 

 @emptyBody
  Scenario Outline: Method POST createProduct Successfully
    Given Set method createProduct to POST-002
    When Set URL createProduct https://alta-shop.herokuapp.com/api/products-002
    And Send Request createProduct-002
    Then Show the verify result createProduct 400 bad request-002
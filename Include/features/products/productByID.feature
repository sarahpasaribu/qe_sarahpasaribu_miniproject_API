
Feature: Title of your feature
  I want to use this template for my feature file

 @createProductSuccessfully
  Scenario Outline: Method GET createProduct Successfully
    Given Set method getProductByID to GET-001
    When Set URL getProductByID   https://alta-shop.herokuapp.com/api/products/10-001
    And Send Request getProductByID-001
    Then Show the verify result getProductByID 200 OK-001 

 @createProductSuccessfully
  Scenario Outline: Method POST createProductByID Unsuccessfully
    Given Set method getProductByID to POST-002
    When Set URL getProductByID https://alta-shop.herokuapp.com/api/products-002
    And Set body getProductByID using Test Data-002
    And Send Request getProductByID-002
    Then Show the verify result getProductByID 200 OK-002
    
    

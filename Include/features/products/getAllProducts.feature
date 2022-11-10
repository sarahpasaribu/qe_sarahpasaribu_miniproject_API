@tag
Feature: Get All Products

@getAllProductsValid
  Scenario Outline: Method GET all products successfully
    Given Set method getAllProducts to GET-001
    When Set URL getAllProducts https://alta-shop.herokuapp.com/api/products-001
    And Send Request getAllProducts-001
    Then Show the verify getAllProducts result 200 OK -001
    
@invalidMethod
  Scenario Outline: Method PUT all products Unsuccessfully
    Given Set method getAllProducts to POST-002
    When Set URL getAllProducts https://alta-shop.herokuapp.com/api/products-002
    And Send Request getAllProducts-002
    Then Show the verify getAllProducts result 405 METHOD NOT ALLOWED-002
    
 
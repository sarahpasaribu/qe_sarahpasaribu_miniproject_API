@tag
Feature: Title of your feature
  I want to use this template for my feature file

 @ValidGetCate
    Scenario Outline: GET category by ID successfully
    Given Set category by ID method to GET-001
    When Set URL https://alta-shop.herokuapp.com/api/categories-001
    Then Show verify category by ID result 200 OK-001

    
 @invalidMethod
    Scenario Outline: POST category by ID successfully
    Given Set category by ID method to POST-002
    When Set URL https://alta-shop.herokuapp.com/api/categories-002
    Then Show verify category by ID result 405 METHOD NOT ALLOWED-002
@tag
Feature: get all Category

  @ValidGetCate
    Scenario Outline: GET all category successfully
    Given Set method all category to GET-001
    When Set URL get All Category get all Category https://alta-shop.herokuapp.com/api/categories-001
    Then Show the verify all category result 200 OK-001
    
   @invalidMethod
    Scenario Outline: POST all category successfully
    Given Set method to POST-002
    When Set URL get All Category https://alta-shop.herokuapp.com/api/categories-002
    Then Show the verify result 405 METHOD NOT ALLOWED-002
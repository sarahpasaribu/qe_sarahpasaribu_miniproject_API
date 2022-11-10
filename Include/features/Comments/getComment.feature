@tag
Feature: Get Comment 


  @getCommentSuccess
  Scenario Outline: Method GET comment product Successfully
    Given Set get comment method to POST-001
    When Set URL get comment https://alta-shop.herokuapp.com/api/products/2/comments-001
    And Send get comment Request-001
    Then Show get comment the verify result 200 OK-001 

 @getCommentSuccess
  Scenario Outline: Method GET comment product Successfully
    Given Set get comment method to POST-002
    When Set URL get comment https://alta-shop.herokuapp.com/api/products-002
    And Send get comment Request-002
    Then Show get comment the verify result 404 NOT FOUND-002
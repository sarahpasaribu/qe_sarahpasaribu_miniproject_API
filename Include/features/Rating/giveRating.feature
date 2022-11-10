@tag
Feature: Give Rating Feature

 #@giveRating
  #Scenario Outline: Method POST login Successfully
    #Given Set method to POST-001
    #When Set URL giveRating https://alta-shop.herokuapp.com/api/products/2/comments-001
    #And Set body giveRating using Test Data-001 
    #And Send Request giveRating-001
    #Then Show the verify giveRating result 200 OK-001 
    
    
  @giveRatingNegative
  Scenario Outline: Method POST login unsuccessfully
    Given Set method giveRating to POST-002
    When Set URL giveRating https://alta-shop.herokuapp.com/api/products/2/comments-002
    And Set body giveRating using Test Data-002 
    And Send Request giveRating-002
    Then Show the verify giveRating result 401 unauthorized -002
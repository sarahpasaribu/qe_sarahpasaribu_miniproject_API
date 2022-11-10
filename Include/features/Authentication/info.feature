@tag
Feature: Info Feature


  #@validGetInfo
  #Scenario Outline: GET Info Successfully
    #Given Set method to GET-001
    #When Set URL https://alta-shop.herokuapp.com/api/auth/info-001
    #And Set body using Test Data-001
    #Then Show the verify result 200 OK-001

  @invalidGetInfo
    Scenario Outline: GET Info Unsuccessfully
    Given Set method to GET-002
    When Set URL https://alta-shop.herokuapp.com/api/auth/info-002
    And Set body using Test Data-002
    Then Show the verify result 404 NOT FOUND-002
    
    
@tag
Feature: Register

 @registerSuccess
  Scenario Outline: Method POST resgister Successfully
    Given Set register method to POST-001
    When Set URL https://alta-shop.herokuapp.com/api/auth/register-001
    And Set register body using Test Data-001 
    And Send register Request-001
    Then Show register the verify result 200 OK-001 
    
 @invalidMethod
  Scenario Outline: Method GET register Unsuccessfully
    Given Set register method to GET-002
    When Set URL https://alta-shop.herokuapp.com/api/auth/register-002
    And Set register body using Test Data-002
    And Send register Request-002
    Then Show register the verify result 405 METHOD NOT ALLOWED-002

 @invalidSyntax
  Scenario Outline: Method POST register Unsuccessfully
    Given Set register method to POST-003
    When Set URL https://alta-shop.herokuapp.com/api/auth/register-003
    And Set register body using Test Data-003
    And Send register Request-003
    Then Show register the verify result 400 BAD REQUEST-003
    
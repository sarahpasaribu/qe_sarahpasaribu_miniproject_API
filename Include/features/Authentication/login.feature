@login
Feature: Login Feature
  I want to use this template for my feature file

 @loginsuccess
  Scenario Outline: Method POST login Successfully
    Given Set method to POST-001
    When Set URL https://alta-shop.herokuapp.com/api/auth/login-001
    And Set body using Test Data-001 
    And Send Request-001
    Then Show the verify result 200 OK-001 
    
  @wrongUrl
  Scenario Outline: Method POST login Successfully
    Given Set method to POST--002
    When Set URL https://alta-shop.herokuapp.com/api/auth/login/01
    And Set body using Test Data-002 
    And Send Request-002
    Then Show the verify result 404 NOT FOUND-002
    
  @invalidMethod
  Scenario Outline: Method POST login Successfully
    Given Set method to GET-003
    When Set URL https://alta-shop.herokuapp.com/api/auth/login-003
    And Set body using Test Data-003 
    Then Show the verify result 400 BAD REQUEST-003
    
  @invalidEmail
  Scenario Outline: Method POST login Successfully
    Given Set method to POST-004
    When Set URL https://alta-shop.herokuapp.com/api/auth/login-004
    And Set body using Test Data-004 
    And Send Request-004
    Then Show the verify result 400 BAD REQUEST-004


	@invalidPass
	  Scenario Outline: Method POST login Successfully
    Given Set method to POST-005
    When Set URL https://alta-shop.herokuapp.com/api/auth/login-005
    And Set body using Test Data-005 
    And Send Request-005
    Then Show the verify result 400 BAD REQUEST-005

   @invalidEmailandPass
	  Scenario Outline: Method POST login Successfully
    Given Set method to POST-006
    When Set URL https://alta-shop.herokuapp.com/api/auth/login-006
    And Set body using Test Data-006 
    And Send Request-006
    Then Show the verify result 400 BAD REQUEST-006
@tag
Feature: Create Comment Product

 #@commentProdSuccess
  #Scenario Outline: Method POST comment product Successfully
    #Given Set comment product method to POST-001
    #When Set URL comment product https://alta-shop.herokuapp.com/api/products/2/-001
    #And Send comment product Request-001
    #Then Show comment product the verify result 200 OK-001 

    
 @invalidURL
  Scenario Outline: Method POST comment product unsuccessfully
    Given Set comment product method to POST-002
    When Set URL comment product https://alta-shop.herokuapp.com/api/products/2/-002
    And Send comment product Request-002
    Then Show comment product the verify result 500 internal server error-002
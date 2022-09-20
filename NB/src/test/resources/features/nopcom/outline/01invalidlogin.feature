Feature: InvalidLoginUserNopCom

  Scenario: User invalid login
    When User go to web NopCom
    And User enter invalid username password 
    And User click button invalid login
    Then User invalid credentials
  

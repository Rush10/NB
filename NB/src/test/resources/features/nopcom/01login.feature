Feature: LoginUserNopCom

  Scenario: User invalid logins
    When User go to web NopCom
    And User enter invalid username password 
    And User click button invalid login
    Then User invalid credentials
  
  Scenario: User valid logins
    When User enter valid username password 
    And User click button valid login
    Then User valid credentials

#Feature: LoginUserNopCom
#
  #Scenario: User invalid login username
    #When User go to web NopCom
    #And User enter invalid username  
    #And User click button first invalid login
    #Then User invalid username credentials
    #
  #Scenario: User invalid login password
    #When User enter invalid password 
    #And User click button second invalid login
    #Then User invalid password credentials
  #
  #Scenario: User valid login
    #When User enter valid username password 
    #And User click button first valid login
    #Then User valid first credentials
    #
  #Scenario: User valid login upper
  #	When User go to web NopCom
    #When User enter valid username password upper
    #And User click button second valid login
    #Then User valid second credentials

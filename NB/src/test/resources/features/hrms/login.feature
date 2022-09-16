Feature: Example Feat

  Scenario: User invalid logins
    When User go to Web HRM
    And User enter username password invalids
    And User click button login
    Then User invalid credentials
  
  Scenario: User valid logins
    When User enter username password valids
    And User click button login valid
    Then User valid credentials

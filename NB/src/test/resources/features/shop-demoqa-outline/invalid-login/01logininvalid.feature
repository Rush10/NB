Feature: Login Invalid Email Password

  Scenario Outline: user invalid login outline
    When browser open Web shop demoqa outline
    And enter invalid <email> and <password> outline
    And button login clicked outline
    Then system check credentials invalid outline

#2 data
    Examples: 
      | email	 						| password  |
      | didi    	 				| didi      |
      | didi@gmail.com    | didi			|

Feature: Comment Invalid Email

  Scenario Outline: user invalid comment outline
    When browser open Web shop demoqa outline
    And enter <name> <website> <comment> <captcha> and invalid <email> outline
    And button submit clicked outline
    Then system check credentials invalid outline

#2 data
    Examples: 
      | name | email     | website | comment | captcha| 
      | didi | didi      |didi     | didi    | dua    | 
      | nana | nana@gmail|nana     | nana    | nana   | 

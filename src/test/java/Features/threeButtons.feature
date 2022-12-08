Feature: Trzy przyciski


  Scenario: Poprawne dziłanie
    Given Użytkownik jest na stronie
    When Użytkownik pierwszy raz klika w odpowiedni przycisk
    And Użytkownik drugi raz klika w odpowiedni przycisk
    And Użytkownik trzeci raz klika w odpowiedni przycisk
    And Użytkownik klika w przycisk check solution
    Then Użytkownikowi pokazuje się napis OK. Good answer


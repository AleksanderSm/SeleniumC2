Feature: Wyszukanie po nazwie odpowiedniego przycisku i kliknęcie w niego

  Jako użytkownik chce mieć możliwość przeklikania przycisków w
  odpowiedniej kolejności

  Scenario: Poprawne kliknięcie przycisku krok 1
    Given Użytkownik przechodzi na stronę "https://antycaptcha.amberteam.pl/exercises/exercise1"
    And Użytkownik sprawdza nazwe przycisku Test Step numer pierwszy
    When Użytkownik wciska właściwy przycisk
    Then Zostaje dodana nazwa przycisku w przeglądarce

  Scenario: Poprawne kliknięcie przycisku krok 2
    Given Użytkownik przechodzi na stronę "https://antycaptcha.amberteam.pl/exercises/exercise1"
    And Użytkownik sprawdza nazwe przycisku Test Step numer drugi
    When Użytkownik wciska właściwy przycisk
    Then Zostaje dodana nazwa przycisku w przeglądarce


  Scenario: Poprawne kliknięcie przycisku krok 3
    Given Użytkownik przechodzi na stronę "https://antycaptcha.amberteam.pl/exercises/exercise1"
    And Użytkownik sprawdza nazwe przycisku Test Step numer trzeci
    When Użytkownik wciska właściwy przycisk
    Then Zostaje dodana nazwa przycisku w przeglądarce
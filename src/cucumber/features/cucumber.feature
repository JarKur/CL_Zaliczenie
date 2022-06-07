Feature: Login User

  Scenario Outline: User can fill in New addresses form on mystore-testlab.coderslab.pl


    Given an open browser mystore-testlab.coderslab.pl
    When Click on signin button
    And   user loggs in with email "<email>" and password "<password>"
    Then fill in formula address with "<alias>" "<address>" "<zip>" "<city>" "<country>" "<phone>"
    And verify if your address has been added

    Examples:
      | email               | password    | alias   | address | zip     | city      | country        | phone      |
      | krk.jarek@gmail.com | abrakadabra | jaro    | Prosta  | 000000  | Warszawa  | UK             | 123456789  |





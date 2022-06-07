Feature: Login User

  Scenario Outline: User can fill in New addresses form on mystore-testlab.coderslab.pl


    Given an open browser mystore-testlab.coderslab.pl
    When Click on signin button
    And   user loggs in with email "<email>" and password "<password>"
    And fill in formula address with "<alias>", "<address>", "<city>", "<postalcode>", "<phone>"
    Then verify if your address has been added

    Examples:
      | email               | password    | alias   | address | postalcode     | city              | phone      |
      | krk.jarek@gmail.com | abrakadabra | jaro    | Prosta  | 000000          | Warszawa          | 123456789  |





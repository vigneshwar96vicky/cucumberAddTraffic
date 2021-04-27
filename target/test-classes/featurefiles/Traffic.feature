#Author: 1996m.vigneshwar@gmail.com
Feature: validate the traffic plan

  Scenario: validate the Add Traffic plan
    Given User launches telecom application
    When User clicks on to Add Traffic plan
    And User fills the fields
    And User clicks the submit button
    Then User verifies the configuration text

  Scenario: validate the Add Traffic plan
    Given User launches telecom application
    When User clicks on to Add Traffic plan
    And User fills the fields using one dimenstional list
      | 230 | 600 | 270 | 55 | 1 | 8 | 1 |
    And User clicks the submit button
    Then User verifies the configuration text

  Scenario: validate the Add Traffic plan
    Given User launches telecom application
    When User clicks on to Add Traffic plan
    And User fills the fields using one dimensitional Map
      | mnrent   | 450 |
      | localmin | 750 |
      | intermin | 450 |
      | smspck   |  65 |
      | minchar  |   1 |
      | interchr |   2 |
      | smschrg  |   1 |
    And User clicks the submit button
    Then User verifies the configuration text

  Scenario: validate the Add Traffic plan
    Given User launches telecom application
    When User clicks on to Add Traffic plan
    And User fills the fields using two dimenstional list
      | 230 | 600 | 270 | 55 | 1 |  8 | 1 |
      | 310 | 775 | 199 | 65 | 3 | 10 | 2 |
      | 299 | 699 | 249 | 49 | 1 |  6 | 1 |
      | 199 | 499 | 209 | 35 | 1 |  4 | 1 |
    And User clicks the submit button
    Then User verifies the configuration text

  Scenario: validate the Add Traffic plan
    Given User launches telecom application
    When User clicks on to Add Traffic plan
    And User fills the fields using two dimenstional Map
      | mnrent | localmin | intermin | smspck | minchar | interchr | smschrg |
      |    230 |      600 |      270 |     55 |       1 |        8 |       1 |
      |    310 |      775 |      199 |     65 |       3 |       10 |       2 |
      |    299 |      699 |      249 |     49 |       1 |        6 |       1 |
      |    199 |      499 |      209 |     35 |       1 |        4 |       1 |
    And User clicks the submit button
    Then User verifies the configuration text

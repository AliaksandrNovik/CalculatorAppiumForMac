Feature: Calculator Substraction

  Background:
  Mac Os Calculator


  Scenario: Positive numbers
    Given Open desktop Calulator app
    When Insert value to input row: 123
    And Click on action button: MINUS
    And Insert value to input row: 100
    And Click on action button: EQUALS
    Then Assert that text input ust have value: 23

  Scenario: Negative numbers
    Given Open desktop Calulator app
    When Insert value to input row: 123
    And Click on action button: MINUS
    And Insert value to input row: -100
    And Click on action button: EQUALS
    Then Assert that text input ust have value: 223

  Scenario Outline: Negative numbers
    Given Open desktop Calulator app
    When Insert value to input row: <value1>
    And Click on action button: MINUS
    And Insert value to input row: <value2>
    And Click on action button: EQUALS
    Then Assert that text input ust have value: <result>
    Examples:
      | value1  | value2 | result  |
      | 127     | 10     | 117     |
      | 1234.56 | 100    | 1134.56 |


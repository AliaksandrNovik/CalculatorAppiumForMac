Feature: Calculator Addition

  Background:
  Mac Os Calculator


  Scenario: Negative numbers
    Given Open desktop Calulator app
    When Insert value to input row: -123
    And Click on action button: PLUS
    And Insert value to input row: 23
    And Click on action button: EQUALS
    Then Assert that text input ust have value: -100

  Scenario: Positive number
    Given Open desktop Calulator app
    When Insert value to input row: 2500
    And Click on action button: PLUS
    And Insert value to input row: 4000
    And Click on action button: EQUALS
    Then Assert that text input ust have value: 6500


  Scenario Outline: Integer and Floating numbers
    Given Open desktop Calulator app
    When Insert value to input row: <value1>
    And Click on action button: PLUS
    And Insert value to input row: <value2>
    And Click on action button: EQUALS
    Then Assert that text input ust have value: <result>
    Examples:
      | value1  | value2 | result  |
      | 127     | 10     | 137     |
      | 1234.56 | 100    | 1334.56 |


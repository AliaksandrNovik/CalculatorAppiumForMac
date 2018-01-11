Feature: Calculator Multiplication

  Background:
  Mac Os Calculator


  Scenario: Positive numbers
    Given Open desktop Calulator app
    When Insert value to input row: 123
    And Click on action button: MULTIPLY
    And Insert value to input row: 100
    And Click on action button: EQUALS
    Then Assert that text input ust have value: 12300

  Scenario: Negative numbers
    Given Open desktop Calulator app
    When Insert value to input row: -123
    And Click on action button: MULTIPLY
    And Insert value to input row: 100
    And Click on action button: EQUALS
    Then Assert that text input ust have value: -12300

  Scenario Outline: Integer and Floating numbers
    Given Open desktop Calulator app
    When Insert value to input row: <value1>
    And Click on action button: MULTIPLY
    And Insert value to input row: <value2>
    And Click on action button: EQUALS
    Then Assert that text input ust have value: <result>
    Examples:
      | value1  | value2 | result |
      | 127     | 10     | 1270   |
      | 1234.56 | 100    | 123456 |



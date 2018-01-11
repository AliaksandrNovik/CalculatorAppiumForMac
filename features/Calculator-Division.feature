Feature: Calculator Division

  Background:
  Mac Os Calculator


  Scenario: Negative number
    Given Open desktop Calulator app
    When Insert value to input row: -100
    And Click on action button: DIVIDE
    And Insert value to input row: -5
    And Click on action button: EQUALS
    Then Assert that text input ust have value: 20


  Scenario: Positive number
    Given Open desktop Calulator app
    When Insert value to input row: 100
    And Click on action button: DIVIDE
    And Insert value to input row: 5
    And Click on action button: EQUALS
    Then Assert that text input ust have value: 20


  Scenario Outline: Integer and Floating numbers
    Given Open desktop Calulator app
    When Insert value to input row: <value1>
    And Click on action button: DIVIDE
    And Insert value to input row: <value2>
    And Click on action button: EQUALS
    Then Assert that text input ust have value: <result>
    Examples:
      | value1  | value2 | result  |
      | 127     | 10     | 12.7    |
      | 1234.56 | 100    | 12.3456 |


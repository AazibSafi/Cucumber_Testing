Feature: Person Service

  Scenario Outline: Save Person Records
    Given person details are given with '<name>' and <age>
    When post service is called
    Then the request should respond with '<message>' and <status>

    Examples:
      | name  | age  | message    | status |
      | John  | 20   | Data Saved | 200    |
      | David | 30   | Data Saved | 200    |
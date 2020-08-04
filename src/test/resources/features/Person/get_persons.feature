Feature: Person Service

  Scenario Outline: Retrieve Person Records
    Given user is logged in
    When get service is called
    Then the request should respond with the List of Person record size greater than <size>
    Examples:
      | size |
      | 0    |


  Scenario Outline: Retrieve Single Person Record
    Given user is log in
    When get service is called with Person id <id>
    Then the request should respond with Person '<name>' and <age>

    Examples:
      | id | name  | age |
      | 2  | David | 30  |
      | 5  | David | 30  |
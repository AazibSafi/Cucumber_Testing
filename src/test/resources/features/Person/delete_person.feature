Feature: Person Service

  Scenario Outline: Delete Person Record
    Given user is log in to Application
    When delete service is called with Person id <id>
    Then the Data should be deleted

    Examples:
      | id |
      | 2  |
      | 3  |
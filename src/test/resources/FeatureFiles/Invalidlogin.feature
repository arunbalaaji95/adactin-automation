
Feature: To validate the invalid login functionality

  Scenario Outline: to validate the invalid login
    Given User is in adactin login page
    When User enter valid "<username>" and "<password>"
    And User click login button
    Then check it in invalid page

    Examples: 
      | username | password |
      | aruj     | hsyy     |
      | balaji   | hhah     |
      | bala     | bb       |

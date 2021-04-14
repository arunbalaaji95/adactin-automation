@sanity
Feature: Pass values

  Background: 
    Given User is in adactin login page
    When User enter valid username and password
    And User click login button

  Scenario Outline: To validate the booking details functionality
    Given User is in adactin booking details page
    When user select "<Location>" and "<Hotel>" and "<Roomtype>" and "<Numberofrooms>" and "<Adultperrooms>" and "<Childperroom>"
    And user select the required hotel and click continue
    And user enter the "<firstname>" and "<lastname>" and "<address>" and "<cc>" select"<type>" and "<month>" and "<year>" and "<cvc>" click book now
    Then user in booking confirmation page

    Examples: 
      | Location  | Hotel          | Roomtype | Numberofrooms | Adultperrooms | Childperroom | firstname | lastname | address | cc               | type             | month    | year | cvc |
      | Sydney    | Hotel Creek    | Standard | 1 - One       | 1 - One       | 1 - One      | arun      | balaaji  | dadas   | 1234567891234567 | American Express | January  | 2022 | 123 |
      | Melbourne | Hotel Sunshine | Double   | 2 - Two       | 2 - Two       | 2 - Two      | bala      | arun     | asdfa   | 7894561230123456 | VISA             | February | 2022 | 345 |

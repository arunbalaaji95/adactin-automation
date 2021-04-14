
Feature: To validate the login functionality

  Background: 
    Given User is in adactin login page
    When User enter valid username and password
    And User click login button
@regression 
  Scenario: To validate the booking details functionality
    Given User is in adactin booking details page
    When user select the location in dropdown like wise location and hotel and room type and no of rooms and adult per room and children per room and user click search button
    And user select the required hotel and click continue
    And user enter the first name last name and card type and expiry date and cvcnumber and click book now
    Then user in booking confirmation page

    
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Values.feature");
formatter.feature({
  "name": "Pass values",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the booking details functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in adactin booking details page",
  "keyword": "Given "
});
formatter.step({
  "name": "user select \"\u003cLocation\u003e\" and \"\u003cHotel\u003e\" and \"\u003cRoomtype\u003e\" and \"\u003cNumberofrooms\u003e\" and \"\u003cAdultperrooms\u003e\" and \"\u003cChildperroom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user select the required hotel and click continue",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003caddress\u003e\" and \"\u003ccc\u003e\" select\"\u003ctype\u003e\" and \"\u003cmonth\u003e\" and \"\u003cyear\u003e\" and \"\u003ccvc\u003e\" click book now",
  "keyword": "And "
});
formatter.step({
  "name": "user in booking confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotel",
        "Roomtype",
        "Numberofrooms",
        "Adultperrooms",
        "Childperroom",
        "firstname",
        "lastname",
        "address",
        "cc",
        "type",
        "month",
        "year",
        "cvc"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "1 - One",
        "1 - One",
        "arun",
        "balaaji",
        "dadas",
        "1234567891234567",
        "American Express",
        "January",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "Melbourne",
        "Hotel Sunshine",
        "Double",
        "2 - Two",
        "2 - Two",
        "2 - Two",
        "bala",
        "arun",
        "asdfa",
        "7894561230123456",
        "VISA",
        "February",
        "2022",
        "345"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the booking details functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User is in adactin booking details page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_adactin_booking_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select \"Sydney\" and \"Hotel Creek\" and \"Standard\" and \"1 - One\" and \"1 - One\" and \"1 - One\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_select_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the required hotel and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_the_required_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"arun\" and \"balaaji\" and \"dadas\" and \"1234567891234567\" select\"American Express\" and \"January\" and \"2022\" and \"123\" click book now",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_and_and_and_select_and_and_and_click_book_now(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_in_booking_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the booking details functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User is in adactin booking details page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_adactin_booking_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select \"Melbourne\" and \"Hotel Sunshine\" and \"Double\" and \"2 - Two\" and \"2 - Two\" and \"2 - Two\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_select_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the required hotel and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_the_required_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"bala\" and \"arun\" and \"asdfa\" and \"7894561230123456\" select\"VISA\" and \"February\" and \"2022\" and \"345\" click book now",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_and_and_and_select_and_and_and_click_book_now(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user in booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_in_booking_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
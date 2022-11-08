$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking Application",
  "description": "//@test1\r\n//Scenario: Login Functionality\r\n//Given user Launch The Adactin Application\r\n//When user Enters The \"sridhar0231\" Username In The InputBox\r\n//And user Enters The \"sridhar123\" Password In The InputBox\r\n//Then user Clicks On The LoginBtn And It Navigate To The SearchPage",
  "id": "adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user Enters The \"\u003cusername\u003e\" Username In The InputBox",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Enters The \"\u003cpassword\u003e\" Password In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Clicks On The LoginBtn And It Navigate To The SearchPage",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "adactin-hotel-booking-application;login-functionality;;1"
    },
    {
      "cells": [
        "sridhar456",
        "12345"
      ],
      "line": 18,
      "id": "adactin-hotel-booking-application;login-functionality;;2"
    },
    {
      "cells": [
        "arun123",
        "15675"
      ],
      "line": 19,
      "id": "adactin-hotel-booking-application;login-functionality;;3"
    },
    {
      "cells": [
        "dharani1235",
        "124556"
      ],
      "line": 20,
      "id": "adactin-hotel-booking-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user Enters The \"sridhar456\" Username In The InputBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Enters The \"12345\" Password In The InputBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Clicks On The LoginBtn And It Navigate To The SearchPage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 5939413200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sridhar456",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.user_Enters_The_Username_In_The_InputBox(String)"
});
formatter.result({
  "duration": 763291000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.user_Enters_The_Password_In_The_InputBox(String)"
});
formatter.result({
  "duration": 190251700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_On_The_LoginBtn_And_It_Navigate_To_The_SearchPage()"
});
formatter.result({
  "duration": 885882900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user Enters The \"arun123\" Username In The InputBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Enters The \"15675\" Password In The InputBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Clicks On The LoginBtn And It Navigate To The SearchPage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 566298400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arun123",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.user_Enters_The_Username_In_The_InputBox(String)"
});
formatter.result({
  "duration": 334035000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15675",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.user_Enters_The_Password_In_The_InputBox(String)"
});
formatter.result({
  "duration": 211052700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_On_The_LoginBtn_And_It_Navigate_To_The_SearchPage()"
});
formatter.result({
  "duration": 602344500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user Enters The \"dharani1235\" Username In The InputBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Enters The \"124556\" Password In The InputBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Clicks On The LoginBtn And It Navigate To The SearchPage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 930526100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dharani1235",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.user_Enters_The_Username_In_The_InputBox(String)"
});
formatter.result({
  "duration": 354767600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "124556",
      "offset": 17
    }
  ],
  "location": "Stepdefinition.user_Enters_The_Password_In_The_InputBox(String)"
});
formatter.result({
  "duration": 186939400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_On_The_LoginBtn_And_It_Navigate_To_The_SearchPage()"
});
formatter.result({
  "duration": 656722500,
  "status": "passed"
});
});
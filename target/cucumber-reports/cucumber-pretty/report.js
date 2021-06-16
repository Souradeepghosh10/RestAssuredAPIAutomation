$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConnectMe/CreateProgramAPI.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@Ignore"
    }
  ],
  "line": 2,
  "name": "Validating Create Connect Me program type from 10S SCM API",
  "description": "",
  "id": "validating-create-connect-me-program-type-from-10s-scm-api",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User validate Create connect Me after successfully getting Login token",
  "description": "",
  "id": "validating-create-connect-me-program-type-from-10s-scm-api;user-validate-create-connect-me-after-successfully-getting-login-token",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@ConnectMe"
    },
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User enters Valid LoginID \"\u003cUserName\u003e\" and \"\u003cPassWord\u003e\" and get the get the Login Token",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters details for Connect me \"SetConnectMeRequest\" and \"POST\" the request for API",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user validate API call got success  with status  code \"\u003cStatusCode\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "validating-create-connect-me-program-type-from-10s-scm-api;user-validate-create-connect-me-after-successfully-getting-login-token;",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord",
        "StatusCode"
      ],
      "line": 11,
      "id": "validating-create-connect-me-program-type-from-10s-scm-api;user-validate-create-connect-me-after-successfully-getting-login-token;;1"
    },
    {
      "cells": [
        "AutoUser17371",
        "Demo@12345",
        "200"
      ],
      "line": 12,
      "id": "validating-create-connect-me-program-type-from-10s-scm-api;user-validate-create-connect-me-after-successfully-getting-login-token;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User validate Create connect Me after successfully getting Login token",
  "description": "",
  "id": "validating-create-connect-me-program-type-from-10s-scm-api;user-validate-create-connect-me-after-successfully-getting-login-token;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@ConnectMe"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User enters Valid LoginID \"AutoUser17371\" and \"Demo@12345\" and get the get the Login Token",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters details for Connect me \"SetConnectMeRequest\" and \"POST\" the request for API",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user validate API call got success  with status  code \"200\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "AutoUser17371",
      "offset": 27
    },
    {
      "val": "Demo@12345",
      "offset": 47
    }
  ],
  "location": "StepDefinationLoginApi.user_enters_Valid_LoginID_and_and_get_the_get_the_Login_Token(String,String)"
});
formatter.result({
  "duration": 20769961755,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SetConnectMeRequest",
      "offset": 36
    },
    {
      "val": "POST",
      "offset": 62
    }
  ],
  "location": "StepDefinationConnectMeApi.user_enters_details_for_Connect_me_and_the_request_for_API(String,String)"
});
formatter.result({
  "duration": 618312662,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 55
    }
  ],
  "location": "StepDefinationConnectMeApi.user_validate_API_call_got_success_with_status_code(String)"
});
formatter.result({
  "duration": 4875131,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[401]\u003e but was:\u003c[200]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:125)\r\n\tat org.junit.Assert.assertEquals(Assert.java:147)\r\n\tat stepDefinations.ConnectMe.StepDefinationConnectMeApi.user_validate_API_call_got_success_with_status_code(StepDefinationConnectMeApi.java:58)\r\n\tat ✽.And user validate API call got success  with status  code \"200\"(ConnectMe/CreateProgramAPI.feature:8)\r\n",
  "status": "failed"
});
});
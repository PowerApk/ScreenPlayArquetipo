$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/newTours_login.feature");
formatter.feature({
  "name": "NewTours Login",
  "description": "  As a traveler user\n  I want to use NewTours Page\n  to succesfull autentication in home page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NewTours"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User Log in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User type User\"\u003cusuario\u003e\" and Pass\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click log-in button",
  "keyword": "And "
});
formatter.step({
  "name": "User successful login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usuario",
        "password"
      ]
    },
    {
      "cells": [
        "alejo2265",
        "qwe123"
      ]
    },
    {
      "cells": [
        "alejooo",
        "adw1w23"
      ]
    }
  ]
});
formatter.background({
  "name": "Open Browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in NewTours Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userIsInNewToursHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Log in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewTours"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User type User\"alejo2265\" and Pass\"qwe123\"",
  "keyword": "When "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userTypeUserAndPass(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click log-in button",
  "keyword": "And "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userClickLogInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userSuccessfulLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Open Browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in NewTours Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userIsInNewToursHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Log in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewTours"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User type User\"alejooo\" and Pass\"adw1w23\"",
  "keyword": "When "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userTypeUserAndPass(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click log-in button",
  "keyword": "And "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userClickLogInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "NewToursLoginStepsDef.userSuccessfulLogin()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Missing Button - Expected net.serenitybdd.screenplay.QuestionSubject@3ae0b770\nExpected: is \u003ctrue\u003e\n     but: was \u003cfalse\u003e\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:187)\r\n\tat com.newtours.stepsdefinition.NewToursLoginStepsDef.userSuccessfulLogin(NewToursLoginStepsDef.java:60)\r\n\tat ✽.User successful login(src/test/resources/features/newTours_login.feature:15)\r\n",
  "status": "failed"
});
});
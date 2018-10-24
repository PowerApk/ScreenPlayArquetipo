$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/newTours_register.feature");
formatter.feature({
  "name": "NewTours Register",
  "description": "  As a traveler user\n  I want register in New Tours\n  to succsesfull log-in in to the page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NewTours"
    }
  ]
});
formatter.scenarioOutline({
  "name": "NewTours Register",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.step({
  "name": "User fill the form info \u003cattemps\u003e",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "nombre",
        "apellido",
        "phone",
        "email",
        "address1",
        "address2",
        "city",
        "state",
        "postal_cod",
        "country",
        "userName",
        "pass",
        "conf_pass"
      ]
    },
    {
      "cells": [
        "data1",
        "data2",
        "123123",
        "example@test.com",
        "Sabaneta",
        "Shopos",
        "Medellin",
        "Antioquia",
        "10001",
        "42",
        "vash2265",
        "1234",
        "1234"
      ]
    },
    {
      "cells": [
        "data3",
        "data4",
        "123213",
        "badexample@test.com",
        "nothing land",
        "ningun lugar",
        "cualquiera",
        "Valle",
        "6093",
        "43",
        "alejo2265",
        "fjdb",
        "234"
      ]
    }
  ]
});
formatter.step({
  "name": "User sumbit on register button",
  "keyword": "And "
});
formatter.step({
  "name": "User successful registered",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "attemps"
      ]
    },
    {
      "cells": [
        "0"
      ]
    },
    {
      "cells": [
        "1"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in NewTours Register Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userIsInNewToursRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "NewTours Register",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewTours"
    },
    {
      "name": "@Register"
    }
  ]
});
formatter.step({
  "name": "User fill the form info 0",
  "rows": [
    {
      "cells": [
        "nombre",
        "apellido",
        "phone",
        "email",
        "address1",
        "address2",
        "city",
        "state",
        "postal_cod",
        "country",
        "userName",
        "pass",
        "conf_pass"
      ]
    },
    {
      "cells": [
        "data1",
        "data2",
        "123123",
        "example@test.com",
        "Sabaneta",
        "Shopos",
        "Medellin",
        "Antioquia",
        "10001",
        "42",
        "vash2265",
        "1234",
        "1234"
      ]
    },
    {
      "cells": [
        "data3",
        "data4",
        "123213",
        "badexample@test.com",
        "nothing land",
        "ningun lugar",
        "cualquiera",
        "Valle",
        "6093",
        "43",
        "alejo2265",
        "fjdb",
        "234"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userFillTheFormInfo(int,RegisterData\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sumbit on register button",
  "keyword": "And "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userSumbitOnRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successful registered",
  "keyword": "Then "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userSuccessfulRegistered()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in NewTours Register Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userIsInNewToursRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "NewTours Register",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewTours"
    },
    {
      "name": "@Register"
    }
  ]
});
formatter.step({
  "name": "User fill the form info 1",
  "rows": [
    {
      "cells": [
        "nombre",
        "apellido",
        "phone",
        "email",
        "address1",
        "address2",
        "city",
        "state",
        "postal_cod",
        "country",
        "userName",
        "pass",
        "conf_pass"
      ]
    },
    {
      "cells": [
        "data1",
        "data2",
        "123123",
        "example@test.com",
        "Sabaneta",
        "Shopos",
        "Medellin",
        "Antioquia",
        "10001",
        "42",
        "vash2265",
        "1234",
        "1234"
      ]
    },
    {
      "cells": [
        "data3",
        "data4",
        "123213",
        "badexample@test.com",
        "nothing land",
        "ningun lugar",
        "cualquiera",
        "Valle",
        "6093",
        "43",
        "alejo2265",
        "fjdb",
        "234"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userFillTheFormInfo(int,RegisterData\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sumbit on register button",
  "keyword": "And "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userSumbitOnRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successful registered",
  "keyword": "Then "
});
formatter.match({
  "location": "NewToursRegisterStepsDef.userSuccessfulRegistered()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
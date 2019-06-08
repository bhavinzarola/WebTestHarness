$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FeatureFile/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "\nAs a User I wanted to Register successfully on https://demo.nopcommerce.com\nso I can buy any product, I can email any product to friend and filter the product price high to low",
  "id": "registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13148406751,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "To verify user should be able to register successfully",
  "description": "",
  "id": "registration;to-verify-user-should-be-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@registration"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on the registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enter all the personal detail and click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheRegistrationPage()"
});
formatter.result({
  "duration": 350736517,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEnterAllThePersonalDetailAndClickOnRegisterButton()"
});
formatter.result({
  "duration": 5227214610,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToRegisterSuccessfully()"
});
formatter.result({
  "duration": 98509931,
  "status": "passed"
});
formatter.after({
  "duration": 701245312,
  "status": "passed"
});
});
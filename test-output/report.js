$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/eclipse-workspace/TravelloBDDFramework/src/main/java/Features/register.feature");
formatter.feature({
  "line": 1,
  "name": "Django Travello Register Users",
  "description": "",
  "id": "django-travello-register-users",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Django Travello Register a new user scenario",
  "description": "",
  "id": "django-travello-register-users;django-travello-register-a-new-user-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Home page is Travello",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on register link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on Registration Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters registrataion details",
  "rows": [
    {
      "cells": [
        "ajan",
        "singh",
        "ajan",
        "ajan@abc.com",
        "1234",
        "1234"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefinition.user_is_already_on_Home_Page()"
});
formatter.result({
  "duration": 3977984026,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.title_of_Home_page_is_Travello()"
});
formatter.result({
  "duration": 25536822,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_click_on_register_link()"
});
formatter.result({
  "duration": 159589527,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_is_on_Registeration_Page()"
});
formatter.result({
  "duration": 8164342,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_enters_registrataion_details_and_and_and_and_and(DataTable)"
});
formatter.result({
  "duration": 254236368,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 392184364,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.user_moves_to_login_page()"
});
formatter.result({
  "duration": 3978235,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 73824168,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/suntaragali/crm/features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is in Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deals details",
  "rows": [
    {
      "cells": [
        "testdeal",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 18839161758,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.title_page_is_Free_CRM()"
});
formatter.result({
  "duration": 212600308,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 488253467,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_clicks_Login_button()"
});
formatter.result({
  "duration": 8775231625,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_is_in_Homepage()"
});
formatter.result({
  "duration": 17431270,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_moves_to_new_deals_page()"
});
formatter.result({
  "duration": 2163350835,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 2458695670,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.close_browser()"
});
formatter.result({
  "duration": 1252060390,
  "status": "passed"
});
});
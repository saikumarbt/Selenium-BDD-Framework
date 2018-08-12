$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/suntaragali/crm/features/dealsMap.feature");
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
  "name": "user is in Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title page displays Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters his username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is at Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user mouse hovers to new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deals data",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 14
    },
    {
      "cells": [
        "deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    },
    {
      "cells": [
        "deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 16
    },
    {
      "cells": [
        "deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser finally",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefWithMap.user_is_in_Login_Page()"
});
formatter.result({
  "duration": 13565267562,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefWithMap.title_page_displays_Free_CRM()"
});
formatter.result({
  "duration": 69692336,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefWithMap.user_enters_his_username_and_password(DataTable)"
});
formatter.result({
  "duration": 506132908,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefWithMap.user_clicks_on_Login()"
});
formatter.result({
  "duration": 5800254924,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefWithMap.user_is_at_Homepage()"
});
formatter.result({
  "duration": 11347969,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefWithMap.user_mouse_hovers_to_new_deals_page()"
});
formatter.result({
  "duration": 1520121031,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefWithMap.user_enters_deals_data(DataTable)"
});
formatter.result({
  "duration": 10422140636,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefWithMap.close_the_browser_finally()"
});
formatter.result({
  "duration": 1218858576,
  "status": "passed"
});
});
Feature: Deal Data creation

Scenario: Free CRM create a new deal scenario

Given user is on Login Page
When title page is Free CRM
Then user enters username and password
|naveenk | test@123 |
Then user clicks Login button
Then user is in Homepage
Then user moves to new deals page
Then user enters deals details
|testdeal | 1000 | 50| 10 |
Then close browser
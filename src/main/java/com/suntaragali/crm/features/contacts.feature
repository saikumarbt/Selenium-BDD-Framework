Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on Homepage
Then user moves to new Contact page
Then user enters contact details like "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
| username | password | firstname | lastname | position |
| naveenk | test@123 | Tom | Peter | Manager |
| naveenk | test@123 | Angelina | Jolie | Secretary |